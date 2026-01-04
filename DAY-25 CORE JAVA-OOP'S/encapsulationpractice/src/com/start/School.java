package com.start;

public class School {
	
	// IF 5 PARAMETER SO POSSIBLE, BUT IF [500,5000/50000] SO WHAT WE DO
	// WITHOUT ENCAPSULATION
	public void studentDetails(StudentData studentData) {
		
		System.out.println("YOUR ROLL NO. IS: "+studentData.roll);
		System.out.println("YOUR AGE IS: "+studentData.age);
		System.out.println("YOUR GENDER: "+studentData.gender);
		System.out.println("PHYSICAL CHALLENGE: "+studentData.pc);
		System.out.println("YOUR PCM PERCENTAGE IS: "+studentData.pcmPercentage);
		System.out.println();
	}
}
