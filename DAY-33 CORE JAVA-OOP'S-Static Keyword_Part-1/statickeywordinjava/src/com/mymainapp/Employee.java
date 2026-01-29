package com.mymainapp;

import java.util.Scanner;

public class Employee {
	
	private int id;
	private int age;
	
	private static int countryCode;
	
	static {
		System.out.print("ENTER YOUR COUNTRYCODE: \n");
		Scanner scanner = new Scanner(System.in);
		countryCode = scanner.nextInt();
	}
	
	public Employee(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}

	public void employeeDetails() {
		
		System.out.println("ID:" + id);
		System.out.println("AGE:" + age);
		System.out.println("COUNTRYCODE:" + countryCode + "\n");
	}
}
