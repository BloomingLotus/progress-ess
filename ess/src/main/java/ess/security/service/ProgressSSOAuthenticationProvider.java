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
import ess.controller.service.ProgressSSOClient;
import ess.security.model.EssUserDetails;
import ess.security.model.User;

public class ProgressSSOAuthenticationProvider implements AuthenticationProvider {

	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private ProgressSSOClient progressSSOClient;
	
	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		String userName = authentication.getName();
		String password = authentication.getCredentials().toString();
		
		//LoginResponse  response = progressSSOClient.getLogin(userName, password);
		
		//log.debug(response);
		
		//if(response.getLoginResult().getObject().getTicketID() != null) {
		if(password != null) {
		
			//GetStaffProfileByNameResponse staffProfile = progressSSOClient.getStaffProfileByName(userName);
			
			//log.debug("empID: " + staffProfile.getGetStaffProfileByNameResult().getObject().getEmployeeID());
			
			User user = new User();
			//user.setEmpId(staffProfile.getGetStaffProfileByNameResult().getObject().getEmployeeID());
			user.setEmpId(5817);
			user.setUsername(userName);
			user.setId(null);
			user.setPassword(password);
			
			
			
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
