package com.protactdata;

public class StudentData {
	
	// HERE OUR DATA NOT HIDE
	/*
	 * 
	public int roll;
	public int age;
	public char gender;
	public boolean pc;
	public float pcmPercentage;
	
	*/ 
	
	// IF YOU WANT TO YOUR DATA HIDE USE (PRIVATE/PROTACTED KEYWORD)
	// & FOR ACCESSING PRIVATE/PROTACTED DATA USE GETTER AND SETTER 
	private int roll;
	private int age;
	private char gender;
	private boolean pc;
	private float pcmPercentage;
	
	// GETTER AND SETTER 
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	// GETTER AND SETTER 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// GETTER AND SETTER 
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// GETTER AND SETTER 
	public boolean isPc() {
		return pc;
	}
	public void setPc(boolean pc) {
		this.pc = pc;
	}
	
	// GETTER AND SETTER 
	public float getPcmPercentage() {
		return pcmPercentage;
	}
	public void setPcmPercentage(float pcmPercentage) {
		this.pcmPercentage = pcmPercentage;
	}
	
	
	
}
