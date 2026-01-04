package com.start;

public class PracticeMethod {
	// CASE: 1 - (NO PARAMETER, NO RETURN)
	// SELF CONTAINED LOGIC
	public void test1() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(5*i);
		}
	}
	
	// CASE: 2 - (PARAMETER, NO RETURN)
	/* SITUATION: When the logic is based on 
	   the value which is coming from outside.
	 */
	public void test2(int a, float b) {
		for(int i = 1; i <= 10; i++) {
//			System.out.println(a*i);
			System.out.println(b*i);
		}
	}
	
		
	// CASE: 3 - (NO PARAMETER, RETURN)
	/* when we need not to send any value to the method 
	   but we expect some return. 
	   Ex. nextInt(); // In-build method
	   	   int a = Scanner.nextInt();
	 * */
	public int test3() {
		
//			return 10; // RETURN CONSTANT
		
//		int c = 15;
//		return c;  // RETURN VARIABLE
		
		int x = 20;
		int y = 25;
		int sol = x + y;  // RETURN EXPRESSION
//		return sol;
		
		int a = 20;
		int b = 10 ;
		return a + b;
		
	}
		
	// CASE: 4 - (PARAMETER, RETURN)
	public int test4(int i, int j, int k) {
		return i+j+k; 
	}
}
