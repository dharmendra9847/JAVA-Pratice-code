package com.vectorinjava;

import java.util.Vector;

public class Lunch {

	public static void main(String[] args) {
		
		Vector<String> list = new Vector<String>();
		list.add("Data1");
		list.add("Data2");
		list.add("Data3");
		list.add("Data4");
		list.add("Data5");
		
		System.out.println(list);
		list.add(1, "XXXX");
		
		System.out.println(list);
	}

}
