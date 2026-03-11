package com.linkedlistinjava;

import java.util.LinkedList;

public class Lunch {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("Data1");
		l.add("Data2");
		l.add("Data3");
		l.add("Data4");
		l.add("Data5");
		
		System.out.println(l);
		l.add(1, "XXXX");
		
		System.out.println(l);
	}

}
