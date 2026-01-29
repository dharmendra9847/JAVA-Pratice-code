package com.launch;

public class Employee {

	private int result;
	private static int commonResult;
	
	public void objectSpecificLogic(int a, int b) {
		result = a * b;
	}
	
	public void printObjectSpecificLogic() {
		System.out.println(result);
	}
	
	public void printCommonLogic() {
		System.out.println(commonResult);
	}
	
	public static void commonLogic(int a, int b) {
		commonResult = a * b;
	}
	
//	public static void printCommonResult() {		
//		System.out.println(commonResult);
//	}
}
