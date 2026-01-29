package com.start;

public class Employee {
	
	//private int count = 10; //INSTANCE VARIABLE
	//private final int count = 10; //INSTANCE VARIABLE
	
	
	private static int count = 10;  //CLASS VARIABLE / STATIC VARIBLE
	
	public Employee() {
		count++;
	}
	
	public void print() {
		System.out.println("COUNT:" + count);
	}
}
