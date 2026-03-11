package com.mapinterface;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		TreeMap<Integer, String> reverseTreeMap = new TreeMap<Integer, String>(Collections.reverseOrder());
		
		treeMap.put(110, "Data1");
		treeMap.put(110, "Data2");
		treeMap.put(120, "Data3");
		treeMap.put(163, "Data4");
		treeMap.put(140, "Data5");
		
		System.out.println(treeMap);
		
		System.out.println(reverseTreeMap);
		
		//REMOVE
		treeMap.remove(110);
		System.out.println(treeMap);
		
		boolean containsKey = treeMap.containsKey(120);
		System.out.println(containsKey);
		
		// HOW TO ITERATE HASHMAP
		//1st. Convert it to Set
		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
