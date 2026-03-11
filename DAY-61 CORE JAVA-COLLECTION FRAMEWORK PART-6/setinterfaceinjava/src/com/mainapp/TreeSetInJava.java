package com.mainapp;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(11);
		ts.add(25);
		ts.add(365);
		ts.add(10);
		ts.add(420);
		ts.add(22);
		
		System.out.println(ts);
		
		ts.remove(11);
		
		System.out.println(ts);
		
		
		// ITERATE
		Iterator<Integer> iterator = ts.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		

	}

}
