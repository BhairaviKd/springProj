//package com.boot.proj.config;
//
//import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
//import org.springframework.boot.actuate.health.HealthEndpoint;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.stereotype.Component;
//
//@Configuration
//@Component 
//public class CustomWebConfig extends WebSecurityConfiguration{
//
//	public void configure(HttpSecurity http) throws Exception{
//		http.authorizeHttpRequests()
//		.requestMatchers(EndpointRequest.to(HealthEndpoint.class)).permitAll()
//		.requestMatchers(EndpointRequest.toAnyEndpoint()).hasRole("ADMIN");
//		http.csrf().and().httpBasic();
//	}
//}
