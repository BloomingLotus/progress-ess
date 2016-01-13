package ess.security.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.ProviderNotFoundException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.ws.client.WebServiceIOException;

import progress.hrStaffGeneral.wsdl.GetItemGeneralDetailDataResponse;
import progress.hrStaffWorkingInfo.wsdl.GetItemEmployeeWorkingInfoResponse;
import progress.hrsso.wsdl.GetAllApplicationNameResponse;
import progress.hrsso.wsdl.GetCurrentRoleInApplicationResponse;
import progress.hrsso.wsdl.GetStaffProfileByNameResponse;
import progress.hrsso.wsdl.LoginResponse;
import ess.controller.service.EntityService;
import ess.controller.service.ProgressHRGeneralClient;
import ess.controller.service.ProgressHRWorkingInfoClient;
import ess.controller.service.ProgressSSOClient;
import ess.model.Employee;
import ess.model.Sex;
import ess.security.model.EssUserDetails;
import ess.security.model.User;

public class ProgressSSOAuthenticationProvider implements AuthenticationProvider {

	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private ProgressSSOClient progressSSOClient;
	
	
	@Autowired
	private ProgressHRWorkingInfoClient hrWorkingInfoClient;
	
	@Autowired
	private ProgressHRGeneralClient hrGeneralClient;
	
	@Autowired
	private EntityService entityService;
	
	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		String userName = authentication.getName();
		String password = authentication.getCredentials().toString();
		
		log.debug("trying to login with: " + userName + " and passowrd: " + password);
		LoginResponse  response;
		
		try {
			response = progressSSOClient.getLogin(userName, password);
		} catch (WebServiceIOException e) {
			throw new  AuthenticationServiceException("Unable to connect to SSO Web Service!");
		}
		
		GetAllApplicationNameResponse appNameRes = progressSSOClient.getAllApplicationName();
		log.debug("all app name: " + appNameRes.getGetAllApplicationNameResult().getObjectList().getString());
		log.debug(response.getLoginResult().getMessages());
		log.debug(response.getLoginResult().getObject().getSPMessage());
		log.debug(response.getLoginResult().getObject().getTicketID());
		
		
//		if(response.getLoginResult().getObject().getTicketID() != null) {
		if(true) {
			GetStaffProfileByNameResponse staffProfile = progressSSOClient.getStaffProfileByName(userName);
			log.debug(staffProfile.getGetStaffProfileByNameResult().getObject().toString());
			
			log.debug("empID: " + staffProfile.getGetStaffProfileByNameResult().getObject().getEmployeeID());
			
			User user = new User();
			user.setEmpId(staffProfile.getGetStaffProfileByNameResult().getObject().getEmployeeID());
			user.setTicketId(response.getLoginResult().getObject().getTicketID());

			user.setUsername(userName);
			user.setId(null);
			user.setPassword(password);
			
			
			log.debug("token: " + response.getLoginResult().getObject().getTicketID());
			
			GetCurrentRoleInApplicationResponse currentRoleResponse = progressSSOClient.getCurrentRoleInApplication(
					response.getLoginResult().getObject().getTicketID(), "HRMIS");
			
			GetItemEmployeeWorkingInfoResponse workingInfoResponse = hrWorkingInfoClient.getItemEmployeeWorkingInfo(user.getEmpId().longValue());
			GetItemGeneralDetailDataResponse generalDataResponse = hrGeneralClient.getItemDetailDataResponse(user.getEmpId().longValue());
			
			
			log.debug("current Role for empID: " +  user.getEmpId() +  currentRoleResponse.getGetCurrentRoleInApplicationResult().getObjectList().getString());
		
			// now see if this emp has record in our database;
			Employee emp = entityService.findEmployeeFromDB(user.getEmpId().longValue());
			if(emp == null) {
				log.debug("employee is null ");
				emp = new Employee();
				emp.setId(user.getEmpId().longValue());
				entityService.saveEmployee(emp);	
			} else {
				log.debug(" found : " + emp.getId());
			}
			emp.setThTitle(staffProfile.getGetStaffProfileByNameResult().getObject().getThaiPrefix());
			emp.setThFirstName(staffProfile.getGetStaffProfileByNameResult().getObject().getThaiName());
			emp.setThLastName(staffProfile.getGetStaffProfileByNameResult().getObject().getThaiSurname());
			
			emp.setEnTitle(staffProfile.getGetStaffProfileByNameResult().getObject().getEnglishPrefix());
			emp.setEnFirstName(staffProfile.getGetStaffProfileByNameResult().getObject().getEnglishName());
			emp.setEnLastName(staffProfile.getGetStaffProfileByNameResult().getObject().getEnglishSurname());
			emp.setRoles(currentRoleResponse.getGetCurrentRoleInApplicationResult().getObjectList().getString().toString());
			emp.setStartWorkingDate(workingInfoResponse.getGetItemEmployeeWorkingInfoResult().getObj().getStartWorkingDate().toGregorianCalendar().getTime());
			emp.setUserName(userName);
			emp.setPosition(generalDataResponse.getGetItemGeneralDetailDataResult().getObj().getPositionName());
			emp.setDivision(generalDataResponse.getGetItemGeneralDetailDataResult().getObj().getDivisionName());
			
			String genderName = generalDataResponse.getGetItemGeneralDetailDataResult().getObj().getGenderName();
			log.debug(genderName);
			if(genderName.equals("Male")) {
				emp.setSex(Sex.M);
			} else if(genderName.equals("Female")) {
				emp.setSex(Sex.F);
			}
			log.debug("saving... basic information from HRMIS back to ess");
			entityService.saveEmployee(emp);
			
			user.setEmployee(emp);
			
			
			List<GrantedAuthority> grantedAuths = new ArrayList<>();
			grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
				
			EssUserDetails userDetail = new EssUserDetails(user, grantedAuths);
			
			Authentication auth = new UsernamePasswordAuthenticationToken(userDetail, password, grantedAuths );
			
			return auth;
		
		} 

		throw new BadCredentialsException("UserName and Password cannot be found!");

	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
