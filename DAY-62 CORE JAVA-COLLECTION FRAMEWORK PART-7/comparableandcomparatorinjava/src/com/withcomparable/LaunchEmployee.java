package com.withcomparable;

import java.util.TreeSet;

public class LaunchEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(11, "Name1", 40);
		Employee e2 = new Employee(12, "Name2", 20);
		Employee e3 = new Employee(13, "Name3", 19);
		Employee e4 = new Employee(14, "Name4", 18);
		
		//Without Comparable Interface
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(e2);		// [e2]
		ts.add(e1);		// [e1 e2]
		ts.add(e4);		// [e1 e2 e4]
		ts.add(e3);		// [e1 e2 e3 e4]
		
		System.out.println(ts);	
		/* 
		 * Exception in thread "main" java.lang.ClassCastException: class com.comparableinjava.Employee cannot be cast to class java.lang.Comparable 
		(com.comparableinjava.Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
		
		*/
	}

}
