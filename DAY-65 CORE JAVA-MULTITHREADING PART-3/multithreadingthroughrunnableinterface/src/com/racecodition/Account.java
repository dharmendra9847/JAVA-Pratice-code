package com.racecodition;

public class Account {
	
//	private String name="";
	
//	public void change() {
//		name=name+"a";
//	}
//	
	
	// USING STRINGBUILDER (NON-SYNCHRONIZE) ALWAYS USED IN SIGLE-THREADED ENVIRONMENT
//	private StringBuilder name = new StringBuilder("");
	
	// USING STRINGBUFFER (SYNCHRONIZED) ALWAYS USED IN MULTI-THREADED ENVIRONMENT
	private StringBuffer name = new StringBuffer("");
	public void change() {
		name.append("a");
	}
	
	public int get() {
		return name.length();
	}
}
