package com.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInJava {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(110, "Data1");
		hashMap.put(110, "Data2");
		hashMap.put(120, "Data3");
		hashMap.put(163, "Data4");
		hashMap.put(140, "Data5");
		hashMap.put(141, "Data7");
		hashMap.put(142, "Data6");
		
		hashMap.put(null, "Data7");
		hashMap.put(null, "Data8");
		hashMap.put(143, null);
		hashMap.put(144, null);
		
		hashMap.put(11, "Data1");
		hashMap.put(11, "Data2");
		hashMap.put(12, "Data3");
		hashMap.put(13, "Data4");
		hashMap.put(14, "Data5");
		
		System.out.println(hashMap);
		
		//REMOVE
		hashMap.remove(110);
		System.out.println(hashMap);
		
		boolean containsKey = hashMap.containsKey(120);
		System.out.println(containsKey);
		
//		boolean containsValue = hashMap.containsValue("data5");
		boolean containsValue = hashMap.containsValue("Data5");
		System.out.println(containsValue);
		
		// HOW TO ITERATE HASHMAP
		//1st. Convert it to Set
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
