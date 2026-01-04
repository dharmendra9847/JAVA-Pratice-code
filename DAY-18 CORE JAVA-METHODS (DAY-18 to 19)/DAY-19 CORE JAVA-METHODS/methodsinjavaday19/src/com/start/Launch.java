package com.start;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeMethod p = new PracticeMethod();
		
		// CASE: 1 - (NO PARAMETER, NO RETURN)
//		p.test1();
		
		
		// CASE: 2 - (PARAMETER, NO RETURN)
//		p.test2(10, 9.5f);
//		p.test2(2, 9.5f);
		
		// CASE: 3 - (NO PARAMETER, RETURN)
//		int result = p.test3(); 
//		System.out.println("RESULT = " + result);
		
		// Other way to print direct without using variable
		System.out.println("(TEST-3) RESULT= " + p.test3());
		
		
		// CASE: 4 - (PARAMETER, RETURN)
//		p.test4();
		int res = p.test4(4,5,6); 
		System.out.println("(TEST-4) RESULT= " + res);
	}

}
