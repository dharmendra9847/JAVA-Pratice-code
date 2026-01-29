package com.mainapp;

public class Launch {

	public static void main(String[] args) {

		// DEFAULT CONSTRUCTOR RUN HERE
//		Employee employee = new Employee();
//		employee.test();
		
		// DEFAULT CONSTRUCTOR RUN HERE
		Employee employee = new Employee(10, 18, 11.9f);
		System.out.println("***** OLD VALUE *****");
		employee.test();
		System.out.println();
		
		// SET THE VALUE (UPDATE)
		employee.setAge(20);
		System.out.println("***** UPDATED VALUE *****");
		employee.test();
		

	}
}
