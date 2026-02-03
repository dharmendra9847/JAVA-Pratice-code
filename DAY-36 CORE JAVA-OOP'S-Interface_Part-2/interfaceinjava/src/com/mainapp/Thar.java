package com.mainapp;

public class Thar implements MyInterface{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("80 KM/H");
		System.out.println(MyInterface.a);
	}

	@Override
	public void milage() {
		// TODO Auto-generated method stub
		System.out.println("10 KM/L");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("THAR ENGINE");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("BLACK \n");
	}
}
