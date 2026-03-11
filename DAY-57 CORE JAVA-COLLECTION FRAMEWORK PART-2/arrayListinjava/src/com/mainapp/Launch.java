package com.mainapp;

import java.util.ArrayList;

public class Launch {

	public static void main(String[] args) {
		
		ArrayList test = new ArrayList();
		test.add("Test-1");
		test.add("Test-2");
		
		ArrayList al = new ArrayList();
		al.add(1234);
		al.add(1234.56F);
		al.add("xyz");
		al.add('a');
		al.add(false);
		
		System.out.println(al);
		
		// UPDATE VALUE AT ANY INDEX
		al.add(2, 8000);
		System.out.println(al.get(2));  // 8000 Read
		
		System.out.println(al);
		
		
		al.addAll(test);
		System.out.println("Add All Data in al: " + al);
		
		al.addAll(0,test);	// Index wise operation
		System.out.println(al);
		
		IteratorUsingWhileLoop i = new IteratorUsingWhileLoop();
		i.name();

	}

}
