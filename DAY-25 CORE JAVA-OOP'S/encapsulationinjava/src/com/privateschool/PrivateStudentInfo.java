package com.privateschool;

public class PrivateStudentInfo {
	
	// HIDING DATA ( ACCESS ONLY AUTHORIZED PERSON )
	private int roll;
	private int age;
	private char gender;
	private boolean pc;
	private float pcmPer;
	
	
	// GENERATE GETTER & SETTER
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isPc() {
		return pc;
	}
	public void setPc(boolean pc) {
		this.pc = pc;
	}
	public float getPcmPer() {
		return pcmPer;
	}
	public void setPcmPer(float pcmPer) {
		this.pcmPer = pcmPer;
	}
}
