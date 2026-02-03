package com.runtimepolymorphisminjava;

public class Launch {

	public static void main(String[] args) {
		
		Xyz x;           //UPCASTING
		x = new Child1();
		x.pqrs();
		
		
		//BUT WE CANNOT DO THIS
		// x.insert();
		// x.read();

	}

}
