package com.comparableinterfaceproblem;

import java.util.TreeSet;

public class Start {

	public static void main(String[] args) {

		Employee employee1 = new Employee(11, "aaaa", 24, 1000);
		Employee employee2 = new Employee(90, "yyyy", 39, 3000);
		Employee employee3 = new Employee(45, "cccc", 18, 2000);
		Employee employee4 = new Employee(18, "qqqq", 45, 5000);
		Employee employee5 = new Employee(25, "dddd", 20, 9000);
		
		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		
		treeSet.add(employee1);		
		treeSet.add(employee2);		
		treeSet.add(employee3);		
		treeSet.add(employee4);		
		treeSet.add(employee5);	
		
		System.out.print(treeSet);

	}

}
