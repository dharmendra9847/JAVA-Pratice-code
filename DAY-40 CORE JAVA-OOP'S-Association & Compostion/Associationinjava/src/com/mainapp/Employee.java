package com.mainapp;

public class Employee {
	
	private int id;
	private int age;
//	private int carNo;
//	private int carModelNo;
	
	private Car car;

	public Employee(int id, int age, Car car) {
		this.id = id;
		this.age = age;
		this.car = car;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
