package com.mymainapp;

public class Launch {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		System.out.println(employee.result);
		
		
//		System.out.println(employee.commonResult);
		
		System.out.println(Employee.commonResult);
		Employee.staticLogic();
	}

}
