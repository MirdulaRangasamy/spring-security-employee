/**
 * @Placed com.exterro.employee.mapper
 */
package com.exterro.employee.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.exterro.employee.dto.EmployeeDto;
import com.exterro.employee.model.Employee;
import com.exterro.employee.model.Role;

/**
 * @author mrangasamy
 *
 * @date 23-May-2024
 */

@Service
public class EmployeeMapper {
	@Autowired
	private PasswordEncoder encoder;
	
	public Employee employeeDtoToEmployee(EmployeeDto empDto) {
		
		Employee emp = new Employee();
		emp.setId(empDto.getId());
		emp.setEmpId(empDto.getEmpId());
		emp.setEmpName(empDto.getEmpName());
		emp.setEmpEmail(empDto.getEmpEmail());
		emp.setEmpPwd(encoder.encode(empDto.getEmpPwd()));
		emp.setEmpSalary(empDto.getEmpSalary());		
		emp.setEmpRole(Role.USER);
		System.out.println(emp);
		return emp;
	}
	
	public EmployeeDto employeeToEmployeeDto(Employee employee) {
		EmployeeDto empDto = new EmployeeDto();
		empDto.setId(employee.getId());
		empDto.setEmpId(employee.getEmpId());
		empDto.setEmpName(employee.getEmpName());
		empDto.setEmpEmail(employee.getEmpEmail());
		empDto.setEmpPwd(employee.getPassword());
		empDto.setEmpSalary(employee.getEmpSalary());
		return empDto;
		
	}
}
