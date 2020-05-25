package com.devops.bpichincha.devoptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
/*import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;*/
//import com.devops.bpichincha.devoptest.security.JWTAuthorizationFilter2;
//import com.devops.bpichincha.devoptest.security.JWTAuthorizationFilter;

@SpringBootApplication
public class DevopTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopTestApplication.class, args);
	}
    /*Comentario*/
	/*@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.addFilterAfter(new JWTAuthorizationFilter(),UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.POST, "/user").permitAll()
				.anyRequest().authenticated();
		}
	}*/
}
