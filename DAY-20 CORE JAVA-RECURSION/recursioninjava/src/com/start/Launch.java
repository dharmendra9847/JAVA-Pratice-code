package com.start;

public class Launch {

	public static void main(String[] args) {

		/* *********** DAY-20 CORE JAVA-RECURSION ********** */
		
		PracticeMethod p = new PracticeMethod();
		p.test();
		
				
		// FACTORIAL NUMBER
		FindFactorial f = new FindFactorial();
		
		int num = 5;
		int factorial = f.isFactorial(num);
		System.out.println("Factorial of "+ num +" is: "+factorial);
		
		System.out.println(2 + f.isFactorial(num)); // Direct Method add
	
		
		System.out.println(2+p.test2()); // 102
		
		 System.out.println(2+p.test3()); // 2ijk
		
		System.out.println("ABC"+p.test3()); // ABCijk
		
		// System.out.println(2*p.test3()); // CT ERROR
	}
}
