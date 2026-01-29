package com.launch;

public class Launch {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.objectSpecificLogic(100, 200);
		emp1.printObjectSpecificLogic();
		
		Employee emp2 = new Employee();
		emp2.printObjectSpecificLogic();
		
		
		//STATIC METHOD CALL
//		Employee.commonLogic(20, 50);
//		Employee.printCommonResult();
		
		Employee.commonLogic(30, 40);
		emp1.printCommonLogic();
		emp2.printCommonLogic();
		
	}

}
