package com.mainapp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetInJava {

	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("data1");
		hs.add("data1");
		hs.add("xyz");
		hs.add("xyz");
		hs.add("Ramayan");
		hs.add("Mahabharat");
		hs.add("Krishana");
		hs.add("Krishana");
		hs.add("Krishana");
		hs.add("Arjun");
		
		System.out.println(hs);
		
		hs.remove("xyz");
		System.out.println(hs);
		
		hs.isEmpty();
//		hs.contains(hs.hashCode());
		hs.containsAll(hs);
		hs.addAll(hs);
		hs.size();
		
		// ITERATE
		Iterator<String> iterator = hs.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//REMOVE DUPLICATE CHARACTER
		String s = "aaaabbbbttttttttddddddkkkkkkkk";
		StringBuilder sb = new StringBuilder();
		Set<Character> seen = new LinkedHashSet<>();

		for (char c : s.toCharArray()) {
		    if (seen.add(c)) {
		        sb.append(c);
		    }
		}
		System.out.println(sb.toString()); // Output: abtdk
	}

}
