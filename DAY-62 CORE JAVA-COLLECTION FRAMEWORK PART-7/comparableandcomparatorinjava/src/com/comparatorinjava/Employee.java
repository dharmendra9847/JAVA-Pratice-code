package com.comparatorinjava;

// ASCENDING HAI: BASED ON ID HAI
public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int age;
	
	
	// CONSTRUCTOR
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;	
	}

	
	// GETTER AND SETTER
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	// toString() For print my object
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	// Comparable Implements
	// DEFAULT NATURAL SORTING ORDER
	@Override
	public int compareTo(Employee o) {		// (Employee o): PRE-EXISTING OBJECT DEGA
//		return this.id-o.id;	// 11 - 12 = (-1): NEGATIVE VALUE (LEFT SHIFT) : ASCENDING ORDER
		return o.id-this.id;	// 11 - 12 = (-1): NEGATIVE VALUE (LEFT SHIFT) : DESCENDING ORDER
	}

	
	
}
