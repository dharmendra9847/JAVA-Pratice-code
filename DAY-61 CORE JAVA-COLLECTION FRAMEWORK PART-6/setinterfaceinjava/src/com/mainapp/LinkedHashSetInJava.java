package com.mainapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("a11");
		arrayList.add("a12");
		arrayList.add("a13");
		arrayList.add("a14");
		arrayList.add("a15");
		arrayList.add("a16");
		arrayList.add("a17");
		arrayList.add("a18");
		arrayList.add("a19");
		arrayList.add("a20");
		
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("data1");
		hs.add("xyz");
		hs.add("Ramayan");
		hs.add("Mahabharat");
		hs.add("Krishana");
		hs.add("Arjun");
		
		System.out.println(hs);
		
		hs.addAll(arrayList);
		
		System.out.println(hs);
		 
		
		System.out.println(hs.removeFirst());
		
		System.out.println("Remove : "+ hs.remove("Mahabharat"));
		
		System.out.println(hs.removeLast());
		
		
		// ITERATE
		Iterator<String> iterator = hs.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		

	}

}
