package com.mainapp;

import java.util.Scanner;

public class ArrayConceptBasedPractice {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Of Employee : ");
        int n = scanner.nextInt();

        // Condition check
        if(n > 10){
            System.out.println("LIMIT EXCEEDED");
            return;
        }

        // Create array of Employee
        Employee[] emp = new Employee[n];

        // Input employee data
        for (int i = 0; i < emp.length; i++) {

            System.out.println("\nEnter details of employee " + (i + 1));

            System.out.println("Enter Your ID");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println("Enter Your Name");
            String name = scanner.nextLine();

            System.out.println("Enter Your Address");
            String address = scanner.nextLine();

            System.out.println("Enter Your Salary");
            int salary = scanner.nextInt();

            Employee employee = new Employee(id, name, address, salary);
            emp[i] = employee;
        }

        // Display employee data
        System.out.println("\nEmployee Details:");
        for (Employee e : emp) {
            System.out.println(
                    "ID: " + e.id +
                            ", Name: " + e.name +
                            ", Address: " + e.address +
                            ", Salary: " + e.salary
            );
        }
    }
}
