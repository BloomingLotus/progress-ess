package ess.security.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import progress.hrsso.wsdl.GetStaffProfileByName;
import progress.hrsso.wsdl.GetStaffProfileByNameResponse;
import progress.hrsso.wsdl.LoginResponse;
import ess.controller.service.EntityService;
import ess.controller.service.ProgressSSOClient;
import ess.model.Employee;
import ess.security.model.EssUserDetails;
import ess.security.model.User;

public class ProgressSSOAuthenticationProvider implements AuthenticationProvider {

	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private ProgressSSOClient progressSSOClient;
	
	@Autowired
	private EntityService entityService;
	
	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		String userName = authentication.getName();
		String password = authentication.getCredentials().toString();
		
		log.debug("trying to login with: " + userName + " and passowrd: " + password);
		
		LoginResponse  response = progressSSOClient.getLogin(userName, password);
		
		log.debug(response.getLoginResult().getObject().getTicketID());
		
		if(response.getLoginResult().getObject().getTicketID() != null) {
		//if(password != null) {
		
			GetStaffProfileByNameResponse staffProfile = progressSSOClient.getStaffProfileByName(userName);
			log.debug(staffProfile.getGetStaffProfileByNameResult().getObject().toString());
			
			log.debug("empID: " + staffProfile.getGetStaffProfileByNameResult().getObject().getEmployeeID());
			
			User user = new User();
			user.setEmpId(staffProfile.getGetStaffProfileByNameResult().getObject().getEmployeeID());
			user.setTicketId(response.getLoginResult().getObject().getTicketID());
			//user.setEmpId(5817);
			user.setUsername(userName);
			user.setId(null);
			user.setPassword(password);
			
			// now see if this emp has record in our database;
			Employee emp = entityService.findEmployeeFromDB(user.getEmpId().longValue());
			if(emp == null) {
				log.debug("employee is null ");
				emp = new Employee();
				emp.setId(user.getEmpId().longValue());
				emp.setThTitle(staffProfile.getGetStaffProfileByNameResult().getObject().getThaiPrefix());
				emp.setThFirstName(staffProfile.getGetStaffProfileByNameResult().getObject().getThaiName());
				emp.setThLastName(staffProfile.getGetStaffProfileByNameResult().getObject().getThaiSurname());
				
				emp.setEnTitle(staffProfile.getGetStaffProfileByNameResult().getObject().getEnglishPrefix());
				emp.setEnFirstName(staffProfile.getGetStaffProfileByNameResult().getObject().getEnglishName());
				emp.setEnLastName(staffProfile.getGetStaffProfileByNameResult().getObject().getEnglishSurname());
				
				log.debug("saving...");
				entityService.saveEmployee(emp);	
			} else {
				log.debug(" found : " + emp.getId());
			}
			
			
			
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
