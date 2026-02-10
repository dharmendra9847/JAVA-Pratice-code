package com.mainapp;

public class Launch {

	public static void main(String[] args) {

		// Create array of Employee objects
        Employee[] employees = new Employee[5];

        // Add employee objects
        employees[0] = new Employee(101, "Rahul", 50000);
        employees[1] = new Employee(102, "Amit", 55000);
        employees[2] = new Employee(103, "Sneha", 60000);
        employees[3] = new Employee(104, "Neha", 58000);
        employees[4] = new Employee(105, "Rohit", 62000);

        // Iterate using for-each loop
        for (Employee emp : employees) {
            System.out.println(
                "ID: " + emp.id +
                ", Name: " + emp.name +
                ", Salary: " + emp.salary
            );
        }

	}

}
