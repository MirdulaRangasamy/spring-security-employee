/**
 * @Placed com.exterro.employee.service
 */
package com.exterro.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exterro.employee.dto.EmployeeDto;
import com.exterro.employee.dto.MessageDto;
import com.exterro.employee.mapper.EmployeeMapper;
import com.exterro.employee.model.Employee;
import com.exterro.employee.repository.EmployeeRepository;

/**
 * @author mrangasamy
 *
 * @date 23-May-2024
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private EmployeeMapper mapper;
	
	@Override
	public EmployeeDto registerEmployee(EmployeeDto employeeDto) {
		Employee emp = mapper.employeeDtoToEmployee(employeeDto);
		return mapper.employeeToEmployeeDto(empRepo.save(emp));
		}

	@Override
	public EmployeeDto loginEmployee(String empId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDto findEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDto> findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDto updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageDto removeEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
