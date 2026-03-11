package com.mapinterface;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapInJava {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedhashMap = new LinkedHashMap<Integer, String>();
		
		linkedhashMap.put(110, "Data1");
		linkedhashMap.put(110, "Data2");
		linkedhashMap.put(120, "Data3");
		linkedhashMap.put(163, "Data4");
		linkedhashMap.put(140, "Data5");
		
		System.out.println(linkedhashMap);
		
		//REMOVE
		linkedhashMap.remove(110);
		System.out.println(linkedhashMap);
		
		boolean containsKey = linkedhashMap.containsKey(120);
		System.out.println(containsKey);
		
		// HOW TO ITERATE HASHMAP
		//1st. Convert it to Set
		Set<Entry<Integer, String>> entrySet = linkedhashMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
