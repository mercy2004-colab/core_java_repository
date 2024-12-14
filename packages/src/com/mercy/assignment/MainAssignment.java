package com.mercy.assignment;
import com.mercy.assignment.employees.*;
import com.mercy.assignment.utilities.EmployeeUtilities;
public class MainAssignment {

	public static void main(String[] args) {
		Manager manager = new Manager("Mercy", 10, 700000, "Sales", "Assistant Manager");
		Developer developer = new Developer("Mercy", 11, 650000, "Java", "Back-End");
		EmployeeUtilities.printEmployeeDetails(manager);
		EmployeeUtilities.printEmployeeDetails(developer);

	}

}
