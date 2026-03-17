package com.synchronizedblock;

public class Test {
	
	private StringBuffer sb = new StringBuffer("");
	
	private int count = 0;
	private int race = 0;
	
	public void change() {
		sb.append("a");
		
		//ENTIRE OBJECT LOCK
		synchronized (this) {
			count++;	//CRITICAL CODE
		}
		
		race++; //RACE CONDITION
	}
	
	public int getCount() {
		return count;
	}
	public int getRace() {
		return race;
	}
	
}
