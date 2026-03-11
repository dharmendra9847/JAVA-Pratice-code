package com.withoutcomparable;

import java.util.TreeSet;

public class LaunchEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(11, "Name1", 18);
		Employee emp2 = new Employee(12, "Name2", 19);
		Employee emp3 = new Employee(13, "Name3", 20);
		Employee emp4 = new Employee(14, "Name4", 21);
		
		//Without Comparable Interface
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(emp1);	
		ts.add(emp2);	
		ts.add(emp4);		
		ts.add(emp3);		
		
		System.out.println(ts);	
		/* 
		 * Exception in thread "main" java.lang.ClassCastException: class com.comparableinjava.Employee cannot be cast to class java.lang.Comparable 
		(com.comparableinjava.Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
		
		*/
	}

}
