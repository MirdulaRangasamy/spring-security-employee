/**
 * @Placed com.exterro.employee.service
 */
package com.exterro.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exterro.employee.dto.EmployeeDto;
import com.exterro.employee.dto.MessageDto;
import com.exterro.employee.model.Employee;

/**
 * @author mrangasamy
 *
 * @date 23-May-2024
 */
@Service	
public interface EmployeeService {
	EmployeeDto registerEmployee(EmployeeDto employeeDto);
	EmployeeDto loginEmployee(String empId, String password);
	EmployeeDto findEmployee(String empId);
	List<EmployeeDto> findAllEmployee();
	EmployeeDto updateEmployee(Employee employee);
	MessageDto removeEmployee(String empId);
	
}
