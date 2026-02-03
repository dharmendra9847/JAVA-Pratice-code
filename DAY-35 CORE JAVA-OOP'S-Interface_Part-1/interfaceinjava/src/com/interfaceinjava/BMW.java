package com.interfaceinjava;

public class BMW implements MyInterface{
	
	@Override
	public void speed() {
		System.out.println("BMW SPEED");
	}
	
	@Override
	public void milage() {
		System.out.println("BMW MILAGE");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW ENGINE");
	}
	
	@Override
	public void color() {
		System.out.println("BMW COLOR \n");
	}
}
