package ess.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebMvcSecurity
@SpringBootApplication
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.userDetailsService(userDetailsService);
	}



	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	    	.authorizeRequests()
				.antMatchers("/static/**").permitAll()
				.antMatchers("/webjars/**").permitAll()
				.antMatchers("/login**").permitAll()
				.antMatchers("/web/**").permitAll()
				.anyRequest().fullyAuthenticated()
				.and()
			.formLogin()
				.loginPage("/web/").permitAll()
				.loginProcessingUrl("/login")
				.defaultSuccessUrl("/web/")
				.and()
			.logout().logoutUrl("/logout");
			
			
	}
	
}
