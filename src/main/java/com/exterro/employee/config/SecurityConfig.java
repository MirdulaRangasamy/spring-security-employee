/**
 * @Placed com.exterro.employee.config
 */
package com.exterro.employee.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author mrangasamy
 *
 * @date 31-May-2024
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig {
	@Autowired
	private UserDetailsService userDetailService;
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return	http.httpBasic().and().userDetailsService(userDetailService).authorizeHttpRequests().anyRequest().authenticated().and().build();
	}
}
