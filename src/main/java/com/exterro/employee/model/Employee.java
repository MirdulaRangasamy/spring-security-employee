/**
 * @Placed com.exterro.employee.model
 */
package com.exterro.employee.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author mrangasamy
 *
 * @date 23-May-2024
 */
@Entity
public class Employee implements UserDetails{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(unique = true)
	private String empId;
	private String empName;
	@Column(unique = true)
	private String empEmail;
	private String empPwd;
	@Enumerated(EnumType.STRING)
	private Role empRole;
	private double empSalary;
	public Employee(int id, String empId, String empName, String empEmail,String empPwd, double empSalary) {
		super();
		this.id = id;
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPwd = empPwd;
		this.empRole = Role.USER;
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail
				+ ", empPwd=" + empPwd + ", empRole=" + empRole + ", empSalary=" + empSalary + "]";
	}

	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(empRole.name()));
	}
	@Override
	public String getPassword() {
		return empPwd;
	}
	@Override
	public String getUsername() {
		return empId;
	}
	
	
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public Role getEmpRole() {
		return empRole;
	}
	public void setEmpRole(Role empRole) {
		this.empRole = empRole;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}	
}
