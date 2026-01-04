package com.protactdata;

public class School {
	
	// IF 5 PARAMETER SO POSSIBLE, BUT IF [500,5000/50000] SO WHAT WE DO
	// WITHOUT ENCAPSULATION
	public void studentDetails(StudentData studentData) {
		
		System.out.println("YOUR ROLL NO. IS: "+studentData.getRoll());
		System.out.println("YOUR AGE IS: "+studentData.getAge());
		System.out.println("YOUR GENDER: "+studentData.getGender());
		System.out.println("PHYSICAL CHALLENGE: "+studentData.isPc());
		System.out.println("YOUR PCM PERCENTAGE IS: "+studentData.getPcmPercentage());
		System.out.println();
	}
}
