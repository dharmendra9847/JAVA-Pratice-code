package com.mainapp;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car car = new Car(2222, 984765);
		Employee emp = new Employee(11,18);
		System.out.println(emp.getId()); 
		System.out.println(emp.getAge());
		
		System.out.println(emp.getCar());	// O/P: OBJECT (HEXADECIMAL VALUE)
		
		System.out.println(emp.getCar().getCarNo());
		System.out.println(emp.getCar().getCarModelNo());
	}

}
