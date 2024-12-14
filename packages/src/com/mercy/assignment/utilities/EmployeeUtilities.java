package com.mercy.assignment.utilities;
import com.mercy.assignment.employees.*;
public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee employee) {
		 System.out.println("Employee Name: " + employee.getName());
		 System.out.println("Employee ID: " + employee.getEmployeeId());
		 System.out.println("Salary: " + employee.getSalary());
		 if (employee instanceof Manager) {
			 Manager manager = (Manager) employee;
			 System.out.println("Department: " + manager.getDepartment());
			 System.out.println("Designation: " + manager.getDesignation());
		 } else if (employee instanceof Developer) {
		 Developer developer = (Developer) employee;
		 	System.out.println("Programming Language: " + developer.getProgrammingLanguages());
		 	System.out.println("Specialization: " + developer.getSpecialization());
		 }
		 System.out.println();
	}
}
