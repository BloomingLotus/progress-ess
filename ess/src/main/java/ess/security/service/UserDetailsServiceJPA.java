package ess.security.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ess.security.model.EssUserDetails;
import ess.security.model.QUser;
import ess.security.model.User;

@Service
@Transactional
public class UserDetailsServiceJPA implements UserDetailsService {
	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		log.debug("loading information userName: " + userName.toLowerCase());
		
		QUser quser = QUser.user;
		
		User user = userRepository.findOne( quser.username.equalsIgnoreCase(userName) );
		
		
		
		if(user != null) {
			
			log.debug("user: " + user.getUsername());
			List<GrantedAuthority> AUTHORITIES = new ArrayList<GrantedAuthority>();
			AUTHORITIES.add(new SimpleGrantedAuthority("USER"));
			
			return new EssUserDetails(user, AUTHORITIES);
		} else {
			log.debug("user not found!");
			throw new UsernameNotFoundException(userName);
		}
		
	}
	
	

}
