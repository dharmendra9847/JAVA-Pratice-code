package com.loosecoupling;

public class Child implements Test{
	
	@Override
	public void insert() {
		System.out.println("INSERT");
	}
	
	@Override
	public void read() {
		System.out.println("READ");
	}
}
 