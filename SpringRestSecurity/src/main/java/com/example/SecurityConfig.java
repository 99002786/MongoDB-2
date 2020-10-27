package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth
		.inMemoryAuthentication()
		.withUser("Raju")
		.password(passwordEncoder().encode("raju123"))
		.roles("USER")
		.and()
		.withUser("admin")
		.password(passwordEncoder().encode("admin123"))
		.roles("USER","ADMIN");
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		// TODO Auto-generated method stub
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
//		super.configure(http);
		http.authorizeRequests()
//		.antMatchers("/")
		.antMatchers("/","/user/**").hasAnyRole("USER","ADMIN")
		.antMatchers("/**").hasAnyRole("ADMIN")
		.and()
		.formLogin();
		
	}
	

}
