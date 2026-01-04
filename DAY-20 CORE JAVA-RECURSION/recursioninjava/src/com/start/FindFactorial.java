package com.start;

public class FindFactorial {
		
	public int isFactorial(int num) {
			
		if(num == 0 || num == 1) {
			return 1;
		}else {
			 return num * isFactorial(num-1);
			// return num * (num-1);
		}
	}
}
