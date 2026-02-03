package com.mainapp;

public class Curve implements MyInterface{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("60 KM/H");
		System.out.println(MyInterface.a);
	}

	@Override
	public void milage() {
		// TODO Auto-generated method stub
		System.out.println("8 KM/L");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("CURVE ENGINE");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("BLUE \n");
	}

}
