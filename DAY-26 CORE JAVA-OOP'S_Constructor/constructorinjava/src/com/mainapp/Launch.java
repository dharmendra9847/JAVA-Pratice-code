package com.mainapp;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// new Employee(); constructor RUN
		// Employee employee = new Employee(10,true,9.5f); // CTE
		// Employee employee = new Employee(10); // Pass only one 
		
		Employee employee = new Employee(25, 1002, 9.5f);
		
		employee.test1();
		// employee.test2(25, 1002, 9.5f);
		
		employee.setAge(26);
		employee.test1();
	}

}
