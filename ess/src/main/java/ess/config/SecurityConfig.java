package ess.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("user").roles("USER");
    }
	
	
	protected void configure(HttpSecurity http) throws Exception {
	    http
	    	.authorizeRequests()
				.antMatchers("/static/**").permitAll()
				.antMatchers("/webjars/**").permitAll()
				.antMatchers("/landing-login**").permitAll()
				.antMatchers("/web/**").permitAll()
				.anyRequest().fullyAuthenticated()
				.and()
			.formLogin()
				.loginPage("/landing-login").permitAll()
				.loginProcessingUrl("/login")
				.defaultSuccessUrl("/")
				.and()
			.logout().logoutUrl("/logout");
			
			
	}
	
}
