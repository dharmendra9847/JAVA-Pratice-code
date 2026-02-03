package com.runtimepolymorphisminjava;

public class Child2 extends Xyz implements MyInterface{

	
	@Override
	public void pqrs() {
		System.out.println("LOGIC CHILD - 2");
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("CHILD - 2 INSERTED");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("CHILD - 2 READ");
	}

}
