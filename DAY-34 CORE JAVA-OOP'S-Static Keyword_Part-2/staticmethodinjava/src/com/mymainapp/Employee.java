package com.mymainapp;

public class Employee {

	public int result = 10;
	public static int commonResult = 1000;
	
	public void nonStatic() {
		
		System.out.println(result);
		System.out.println(commonResult);
		staticLogic();
	}
	
	public static void staticLogic() {
		System.out.println(commonResult);
		
		//System.out.println(result);
		//nonStatic();
	}
	
}
