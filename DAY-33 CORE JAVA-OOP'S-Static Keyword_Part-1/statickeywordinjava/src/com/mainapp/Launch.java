package com.mainapp;

public class Launch {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(6,18,'M', 110018);
		Employee emp2 = new Employee(7,19,'F', 110018);
		Employee emp3 = new Employee(8,20,'M', 110018);
		Employee emp4 = new Employee(9,21,'F', 110018);
		Employee emp5 = new Employee(10,22,'M', 110018);
		
		emp1.printAllData();
		emp2.printAllData();
		emp3.printAllData();
		emp4.printAllData();
		emp5.printAllData();
		
		System.out.println("***** STATIC KEYWORD USED ***** \n");
		
		//STATIC KEYWORD USED AND INITIALIZE THROUG CONSTRUCTOR
//		EmlpoyeeInfo emlpoyeeInfo1 = new EmlpoyeeInfo(11,23,'M', 201301);
//		EmlpoyeeInfo emlpoyeeInfo2 = new EmlpoyeeInfo(12,24,'F',201301);
//		EmlpoyeeInfo emlpoyeeInfo3 = new EmlpoyeeInfo(13,25,'F', 201301);
//		EmlpoyeeInfo emlpoyeeInfo4 = new EmlpoyeeInfo(14,26,'M',201301);
//		EmlpoyeeInfo emlpoyeeInfo5 = new EmlpoyeeInfo(15,27,'F',201310);
		
		
		EmlpoyeeInfo emlpoyeeInfo1 = new EmlpoyeeInfo(11,23,'M', 201301);
		EmlpoyeeInfo emlpoyeeInfo2 = new EmlpoyeeInfo(12,24,'F',201301);
		EmlpoyeeInfo emlpoyeeInfo3 = new EmlpoyeeInfo(13,25,'F', 201310);
		EmlpoyeeInfo emlpoyeeInfo4 = new EmlpoyeeInfo(14,26,'M',201301);
		EmlpoyeeInfo emlpoyeeInfo5 = new EmlpoyeeInfo(15,27,'F',201301);
		
		emlpoyeeInfo1.printAllDetails();
		emlpoyeeInfo2.printAllDetails();
		emlpoyeeInfo3.printAllDetails();
		emlpoyeeInfo4.printAllDetails();
		emlpoyeeInfo5.printAllDetails();
	}

}
