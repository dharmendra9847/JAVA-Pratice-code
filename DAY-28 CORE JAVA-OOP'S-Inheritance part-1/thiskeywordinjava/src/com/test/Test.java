package com.test;

public class Test {
	
	// INSTANCE VARIABLE
	private int a = 100;
	
	// Default Constructor
	public Test() {
		this(10,20); // CURRENT CUNSTRUCTOR CALL
		System.out.println("T1");
	}

	public Test(int a) {
		this();
		System.out.println("T2");
	}
	
	public Test(int b, int c) {
		System.out.println("T3");
	}
	
	
	// Method
	public void test1() {
		int a = 200;
		System.out.println(a);
	}
}
