package com.mercy.assignment.employees;

public class Developer extends Employee {
	private String programmingLanguage;
	private String specialization;
	public Developer(String name, int employeeId, double salary, String programmingLanguage, String specialization) {
		super(name, employeeId, salary);
		this.programmingLanguage = programmingLanguage;
		this.specialization = specialization;
	}
	public String getProgrammingLanguages() {
		return programmingLanguage;
	}
	public void setProgrammingLanguages(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
}
