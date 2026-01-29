package com.employee;

public class Employee {

	// INSTANCE VARIABLE
	private int a = 1000;
	public int b = 2025;
	
	public void test() {
		// int a = 2000;
		// System.out.println(a);
		// System.out.println(this.a); // INSTANCE PRINT OR GIVES US CURRENT CLASS'S OBJECT
		
		// WRONG
		/*
		Employee employee = new Employee();
//		employee.test();   // INFINITE LOOP 
		System.out.println(employee.a);
		System.out.println(a);
		System.out.println(this.a);
		this.test(); //RECURSION
		*/
	}

	// SETTER
	public int setA(int a) {
		return this.a = a;
	}
	
	
	public void test1(Employee employee) {
		int a = 2000;
		
		System.out.println(a);
		System.out.println(employee.a);
		
		this.test1(employee);
		test1(employee);
	}
	
}
