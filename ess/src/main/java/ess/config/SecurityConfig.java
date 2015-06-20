package ess.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

import ess.security.service.ProgressSSOAuthenticationProvider;
import ess.security.service.UserDetailsServiceJPA;

@Configuration
@EnableWebMvcSecurity
@SpringBootApplication
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private ProgressSSOAuthenticationProvider progressSSOProvider;
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.authenticationProvider(progressSSOProvider);
	}


	
	@Bean 
	public ProgressSSOAuthenticationProvider progressSSOProvider() {
		return new ProgressSSOAuthenticationProvider();
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
			.csrf().disable()
			.formLogin()
				.loginPage("/web/").permitAll()
				.loginProcessingUrl("/login")
				.defaultSuccessUrl("/web/")
				.and()
			.logout().logoutUrl("/logout");
			
			
	}
	
//	@Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth        	
//        	.userDetailsService(userDetailService());
//    }
	
	@Bean 
	public UserDetailsService userDetailService() {
		return new UserDetailsServiceJPA();
	}
	
}
