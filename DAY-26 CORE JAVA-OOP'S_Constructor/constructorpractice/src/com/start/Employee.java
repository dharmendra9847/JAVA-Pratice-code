package com.start;

public class Employee {
	
	
	// CONTRUCTOR CHAINNING
	public Employee() {
		this(10,20);                  // O/P: C3
		System.out.println("C1");
	}
	public Employee(int a) {
		this();                       // O/P: C1
		System.out.println("C2");
	}
	public Employee(int a, int b) {
		//this(10);					  // O/P: C2
		System.out.println("C3");
	}
}
