package com.privateschool;

public class PrivateSchool {
	
	public void studentsDetails(PrivateStudentInfo student) {
		System.out.println("YOUR ROLL IS: " + student.getRoll());
		System.out.println("YOUR AGE IS: " + student.getAge());
		System.out.println("YOUR GENDER IS: " + student.getGender());
		System.out.println("PHYSICALLY CHALLENGE: " + student.isPc());
		System.out.println("YOUR PCM PERCENTAGE IS: " + student.getPcmPer());
	}
}
