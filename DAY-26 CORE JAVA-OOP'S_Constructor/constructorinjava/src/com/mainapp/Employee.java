package com.mainapp;

public class Employee {

	
	private int age;
	private int id;
	private float avg;
	
	// NO PARAMETERIZED CONSTRUCTOR // DEFAULT CONSTRUCTOR CREATED BY JVM
//	public Employee() {
//		System.out.println("This is my 1st constructor!");
//	}
	
	// PARAMETERIZED CONSTRUCTOR // CREATED BY PROGRAMER
	public Employee(int age, int id, float avg) {
		this.age = age;
		this.id = id;
		this.avg = avg;
	}
	
	// NO PARAMETERIZED METHOD
	public void test1() {
		System.out.println("Age :" + age + " | " + "ID :" + id + " | " + "AVERAGE : " + avg);
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}
	

	
	// WE CAN CREATE MULTIPLE CONSTRUCTION IN A CLASS WITH SAME BUT DIFFERENT PARAMETER
//	public Employee(int a) {
//		System.out.println("This is my 2nd constructor!");
//	}
	
//	public Employee(boolean a) {
//		System.out.println("This is my 3rd constructor!");
//	}
//	
//	public Employee(float a) {
//		System.out.println("This is my 4th constructor!");
//	}
	
	
	

	// PARAMETERIZED METHOD
	public void test2(int age, int id, float avg) {
		System.out.println("This is my method!");
		System.out.println("Age :" + age + " | " + "ID :" + id + " | " + "AVERAGE : " + avg);
	}
}
