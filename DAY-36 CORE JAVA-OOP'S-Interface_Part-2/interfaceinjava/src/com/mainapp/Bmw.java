package com.mainapp;

public class Bmw implements MyInterface{
	
	@Override
	public void speed() {
		System.out.println("120 KM/H");
		System.out.println(MyInterface.a);
//		MyInterface.a = 200;
	}

	@Override
	public void milage() {
		// TODO Auto-generated method stub
		System.out.println("20 KM/L");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("BMW ENGINE");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("RED \n");
	}
}
