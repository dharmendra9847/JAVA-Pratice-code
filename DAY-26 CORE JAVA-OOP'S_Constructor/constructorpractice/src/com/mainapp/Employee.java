package com.mainapp;

public class Employee {
	
	
	// INSTANCE VARIABLE, DATA MEMBER, FIELDS
	private int id;
	private int age;
	private float average;
	
	// DEFAUT CONSTRUCTOR, NO ARG CONSTRUCTOR, ZERO PARAMETERIZE CONSTRUCTOR
	public Employee() {
		System.out.println("This is my constructor!");
	}
	
	// PARAMETERIZE CONSTRUCTOR
	public Employee(int id, int age, float average){
		this.id = id;
		this.age = age;
		this.average = average;
	}
	
	// Method
	public void test() {
		System.out.println("ID: " + id);
		System.out.println("AGE: " + age);
		System.out.println("AVERAGE: " + average);
		
	}

	// SETTER
	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAverage(float average) {
		this.average = average;
	}
	
	
}
