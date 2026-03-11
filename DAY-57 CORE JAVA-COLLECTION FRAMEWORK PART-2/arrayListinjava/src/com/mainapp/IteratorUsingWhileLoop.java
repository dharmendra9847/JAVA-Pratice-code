package com.mainapp;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUsingWhileLoop {
	
	public void name() {
		
		ArrayList al = new ArrayList();
		al.add(1234);
		al.add(1234.56F);
		al.add("xyz");
		al.add('a');
		al.add(false);
		al.add("xyz");
		
		al.remove("xyz");
		System.out.println(al);
		
		System.out.println(al.get(3));
		System.out.println(al);
		
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			
			for (Object ele : al) {
				System.out.println(ele);
			}
			System.out.println();
		}
		
	}
}
