package com.start;

public class Launch {

	public static void main(String[] args) {
		// DAY-15 | CORE JAVA
		// 2. Loop Control Flow Statement
				/*
				 * a. for loop
				 * b. while loop
				 * c. do while loop
				 * d. for-each loop
				 * 
				 */
		// 3. Jump Statement
		/*
		 * a. break
		 * b. continue
		 * 
		 */
		
		// for loop
		for(int i = 1; i <= 5; i=i+1){
			System.out.println("Hello"); // INSIDE THE LOOP
		}
		
		
		for(int i = 10; i >= 5; i--){
			System.out.println("Hello"); // INSIDE THE LOOP
		}
		
		
		for(int i = 10; i >= 5; i=i-1){
			System.out.println("Hello"); // INSIDE THE LOOP
		}
		
		
		
		for(int i = 1; i <= 5; i++){
			System.out.println("Hello"); // INSIDE THE LOOP
		}
		
		for(int i = 1; i <= 5; i++)
			; // EMPTY STATEMENT
			
		{
			System.out.println("HEY! WHAT'S HAPPEN? TODAY!"); // OUTSIDE THE LOOP
		}
		
		// NESTED LOOP
		// LABELLED LOOP
		// break
		// continue
		// pattern
		
		
		
		
		// POST INCREMENT(i++)
		
		int k = 10;
		System.out.println(k); // O/P(10)
		System.out.println(k++); // USE THEN INCREMENT SO HERE O/P(10)
		System.out.println(k); // O/P(11)
		
		int b = k;
		System.out.println(b); // USE THEN INCREMENT SO HERE O/P(11)
		b = k++;
		System.out.println(b); // USE THEN INCREMENT SO HERE O/P(11)
		System.out.println(k); // O/P(12)
		
		
		// PRE INCREMENT(++i)
		int a = 20;
		System.out.println(a); // O/P(20)
		System.out.println(++a); // INCREMENT FIRST THEN USE SO HERE O/P(21)
		System.out.println(a); // O/P(21)
		
		int c = k;
		System.out.println(c); // USE THEN INCREMENT SO HERE O/P(12)
		c = ++k;
		System.out.println(c); // INCREMENT FIRST THEN USE SO HERE O/P(13)
		System.out.println(k); // O/P(13)
	}

}
