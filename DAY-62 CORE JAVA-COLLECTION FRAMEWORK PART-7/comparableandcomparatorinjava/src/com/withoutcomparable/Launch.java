package com.withoutcomparable;

import java.util.TreeSet;

public class Launch {

	public static void main(String[] args) {
		
		//DEFAULT NATURAL SORTING ORDER: ASCENDING ORDER
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1000);	// 1000
		ts.add(2000);	// 1000, 2000
		ts.add(90);		// 90, 1000, 2000
		ts.add(12);		// 12, 90, 1000, 2000
		ts.add(7000);	// 12, 90, 1000, 2000, 7000
		ts.add(600);	// 12, 90, 600, 1000, 2000
		
		System.out.println(ts);	//OUTPUT: 12, 90, 600, 1000, 2000
	}

}
