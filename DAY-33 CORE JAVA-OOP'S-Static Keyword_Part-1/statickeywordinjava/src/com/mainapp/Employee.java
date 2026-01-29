package com.mainapp;
// INDIAN EMPLOYEE
public class Employee {
	
	private int id;
	private int age;
	private char gender;
	private int countryCode;
	
	public Employee(int id, int age, char gender, int countryCode) {
		super();
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.countryCode = countryCode;
	}
	
	public void printAllData() {
		System.out.println("ID: " + id);
		System.out.println("AGE: " + age);
		System.out.println("GENDER: " + gender);
		System.out.println("COUNTRYCODE: " + countryCode + "\n");
	}
}
