package com.interfaceinjava;

public class Launch {

	public static void main(String[] args) {
		
		test(new BMW());
		test(new Thar());
		test(new Curve());
	}
	
	public static void test(MyInterface i) {
		i.speed();
		i.milage();
		i.engine();
		i.color();
	}
}
