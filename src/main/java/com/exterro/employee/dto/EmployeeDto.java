/**
 * @Placed com.exterro.employee.dto
 */
package com.exterro.employee.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author mrangasamy
 *
 * @date 23-May-2024
 */
public class EmployeeDto {
	private int id;
	private String empId;
	private String empName;
	private String empEmail;
	private double empSalary;
//	@JsonIgnore
	private String empPwd;
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDto(int id, String empId, String empName, String empEmail, double empSalary,String empPwd) {
		super();
		this.id = id;
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSalary = empSalary;
		this.empPwd = empPwd;
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
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail
				+ ", empSalary=" + empSalary + "]"+empPwd;
	}
}
