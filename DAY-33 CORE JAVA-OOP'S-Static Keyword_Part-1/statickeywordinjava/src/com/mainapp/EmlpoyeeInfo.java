package com.mainapp;

public class EmlpoyeeInfo {
	
	private int id;
	private int age;
	private char gender;
	
	//HERE NOW NOT INSTANCE VARIABLE, NOW THIS IS CLASS VARIABLE OR STATIC VARIABLE
	private static int countryCode = 909090; 
	
	public EmlpoyeeInfo(int id, int age, char gender) {
		super();
		this.id = id;
		this.age = age;
		this.gender = gender;
		
		//WORNING: The static field EmlpoyeeInfo.countryCode should be accessed in a static way
		//this.countryCode = countryCode;
	}
	
	public void printAllDetails() {
		System.out.println("ID: " + id);
		System.out.println("AGE: " + age);
		System.out.println("GENDER: " + gender);
		System.out.println("COUNTRYCODE: " + countryCode + "\n");
	}
}
