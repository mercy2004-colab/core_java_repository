package com.mercy.assignment.employees;

public class Manager extends Employee {
	private String department;
	private String designation;
	public Manager(String name, int employeeId, double salary, String department, String designation) {
		super(name, employeeId, salary);
		this.department = department;
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}	
}
