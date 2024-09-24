/**
 * @Placed com.exterro.employee.config
 */
package com.exterro.employee.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.exterro.employee.repository.EmployeeRepository;

/**
 * @author mrangasamy
 *
 * @date 23-May-2024
 */
@Configuration
public class AppConfig {
	@Autowired
	private EmployeeRepository empRepo;
	
	@Bean
	public UserDetailsService userDetailService() {
		return empId->empRepo.
				findByEmpId(empId)
				.orElseThrow(()->new UsernameNotFoundException("Employee Not Found"));
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
