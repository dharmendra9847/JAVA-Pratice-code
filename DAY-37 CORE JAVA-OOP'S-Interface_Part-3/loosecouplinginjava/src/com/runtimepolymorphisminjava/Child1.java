package com.runtimepolymorphisminjava;

public class Child1 extends Xyz implements MyInterface{

	
	@Override
	public void pqrs() {
		System.out.println("LOGIC CHILD - 1");
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("LOGIC INSERTED");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("LOGIC READ");
	}

}
