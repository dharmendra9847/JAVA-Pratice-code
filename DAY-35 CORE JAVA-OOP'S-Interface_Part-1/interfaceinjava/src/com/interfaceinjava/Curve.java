package com.interfaceinjava;

public class Curve implements MyInterface{

	@Override
	public void speed() {
		System.out.println("CURVE SPEED");
	}
	
	@Override
	public void milage() {
		System.out.println("CURVE MILAGE");
	}
	
	@Override
	public void engine() {
		System.out.println("CURVE ENGINE");
	}
	
	@Override
	public void color() {
		System.out.println("CURVE COLOR \n");
	}
}
