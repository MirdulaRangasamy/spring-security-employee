/**
 * @Placed com.exterro.employee.repository
 */
package com.exterro.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exterro.employee.model.Employee;

/**
 * @author mrangasamy
 *
 * @date 23-May-2024
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Optional<Employee> findByEmpId(String empId);
}
