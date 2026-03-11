package com.startapp;

import java.util.ArrayList;

public class Remove {
	
	public static void main(String[] args) {
		
		ArrayList<Object> test = new ArrayList<Object>();
		test.add("test1");
		test.add("test2");
		test.add('a');
		test.add(false);
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(1234);
		list.add(1456.88f);
		list.add("xyz");
		list.add('a');
		list.add(false);
		list.add("xyz");
		
		list.remove("xyz"); //DIRECT REMOVE BY ELEMENT / OBJECT NAME
		list.remove(0); //REMOVE BY INDEX
		list.removeAll(test); //REMOVE ARRAYLIST
		
		System.out.println(list);
		
	}
}
