package com.vehicles;

public class Car {
	
	
	// DEFAULT CONSTRUCTOR
	public Car() {
				this(25,40);
		System.out.println("C-1");
	}
	
	public Car(int a) {
		this(); // CURRENT CLASS CONSTRUCTOR
		System.out.println("C-2");
	}
	
	public Car(int a, int b) {
		System.out.println("C-3");
	}

	
	
}
