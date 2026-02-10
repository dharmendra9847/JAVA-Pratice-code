package com.practice;

// DATA BINDING: => ENCAPSULATION ACHIEVE KARNE KE LIYE
public class Employee {
	
	private int id;
	private byte age;
	private float height;
	
	public Employee(int id, byte age, float height) {
		this.id = id;
		this.age = age;
		this.height = height;
	}

	public int geteId() {
		return id;
	}

	public void seteId(int id) {
		this.id = id;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
