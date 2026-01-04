package com.start;

public class Launch {

	public static void main(String[] args) {
		// DAY-16 | CORE JAVA
		
		int a; // DECLARATION
		a = 100; // INITIALIZATION
		
		System.out.println(a);
		
		int c; // DECLARATION
		
		{
			int b;
			b = 2000;
			
			c = 3000;
			System.out.println(b);
			
			System.out.println(a);
		}

//		System.out.println(b); Unresolved compilation problem: b cannot be resolved to a variable
		
		System.out.println(c);
		
		
		// FOR LOOP
		for(int i = 1; i <=5; i++) {
			System.out.println(i);
		}
		
		
		// NESTED FOR LOOP
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j == 3) {
					break;
				}
				System.out.print("Hello-1 ");
			}
			System.out.println();
		}
	
		// BREAK STATEMENT
		for(int i = 1; i <= 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println("Hello"+i);
		}
		
		// COMPILE TIME ERROR
		int i = 10;
		if(i == 3) {
//			break;
//			continue;
		}
		System.out.println(i);
		
		
		// COMPILE TIME ERROR
		int j = 3;
		if(j == 3) {
//			break;
//			continue;
		}
		System.out.println(j);
		
		
		// CONTINUE STATEMENT
		for(int k = 1; k <= 5; k++) {
			if(k == 3) {
				continue;
			}
			System.out.println("Hello"+k);
		}
		
		// THIS IS POSSIBLE
		if(j == 3) {
			for(int l = 0; l < 5; l++) {
				System.out.println(l);
			}
		}
		
		
		// label for loop
		loop1:
		for(int k = 1; k <= 5; k++) {
			
			loop2:
			for(int l = 1; l <= 5; l++) {
				if(l == 3) {
					break loop1;
				}
				System.out.print("label for loop ");
			}
			System.out.println();
		}
	}

}
