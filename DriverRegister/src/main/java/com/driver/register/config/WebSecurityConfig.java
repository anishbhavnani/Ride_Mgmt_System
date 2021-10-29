package com.driver.register.config;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity //allows Spring to find and automatically apply the class to the global Web Security.
@EnableGlobalMethodSecurity(prePostEnabled = true) // for AOP
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


@Bean
public ModelMapper modelMapper() {
	return new ModelMapper();
}
	
@Bean
public PasswordEncoder passwordEncoder() {
return new BCryptPasswordEncoder();
}

@Autowired
DataSource dataSource;

@Autowired
public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
	auth.jdbcAuthentication().dataSource(dataSource);
}

@Override
protected void configure(HttpSecurity httpSecurity) throws Exception {
// We don't need CSRF for this example
httpSecurity.cors().and().csrf().disable()
// dont authenticate this particular request
.authorizeRequests().antMatchers("/registerDriver", "/addAddress").permitAll()
//all other requests need to be authenticated
.antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest().authenticated();
}

@Override
public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("/resources/**");                
}
}

