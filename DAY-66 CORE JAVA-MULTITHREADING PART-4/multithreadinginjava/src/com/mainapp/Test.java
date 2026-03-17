package com.mainapp;

public class Test {
	
	private StringBuffer sb = new StringBuffer("");
	
	public void change() {
		sb.append("a");
	}
	
	public int getSb() {
		return sb.length();
	}
	
}
