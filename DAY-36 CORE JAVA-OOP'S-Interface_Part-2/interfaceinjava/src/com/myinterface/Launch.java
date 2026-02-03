package com.myinterface;

public class Launch {

	public static void main(String[] args) {
		
		Xyz x;
		x = new Child1();
		x.pqrs();
		
		
		x = new Child2();
		x.pqrs();
		
		//ABSTRACT CLASS SOLVE THIS PROBLEM   
		//x.insert();
		//x.read();

		// THIS WILL DONE BUT THIS NOT STANDERED
		MyInterface m = (MyInterface) x;
		m.insert();
		m.read();
		
	}

}
