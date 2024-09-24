/**
 * @Placed com.exterro.employee.controller
 */
package com.exterro.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exterro.employee.dto.EmployeeDto;
import com.exterro.employee.service.EmployeeService;

/**
 * @author mrangasamy
 *
 * @date 22-May-2024
 */
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empSvc;
	
	@GetMapping("hello")
	public String getHello() {
		return "HELLO";
	}
	
	@PostMapping("registerEmployee")
	public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto){
		System.out.println(employeeDto);
		return ResponseEntity.ok(empSvc.registerEmployee(employeeDto));
	}
}
