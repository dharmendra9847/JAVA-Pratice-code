package com.start;

public class PracticeMethod {
	
	int count = 1; // INSTANCE VARIABLE (LATTER)
	
	public void test() {
		// System.out.println("Hello Recursion");
		System.out.println("Hello:            " + count);
		// int count = 1;    // INSTANCE VARIABLE (LATTER)
		if(count <= 10) { // BASE CASE
			count++;
			test();       // RECURSION CASE / RECURSIVE CALL / RECURSIVE CASE
		}
	}
	
	
	public int test2() {
		return 100;
	}
	public String test3() {
		return "ijk";	
	}	
}
