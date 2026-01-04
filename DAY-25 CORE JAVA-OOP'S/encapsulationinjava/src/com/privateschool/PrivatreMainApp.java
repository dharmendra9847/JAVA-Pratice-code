package com.privateschool;

import java.util.Scanner;


public class PrivatreMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("[ ***** DAY-25 | WELCOME TO ENCPSULATION IN JAVA ***** ]\n");
			
			
			PrivateSchool school = new PrivateSchool();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("ENTER YOUR ROLL: ");
			int roll = sc.nextInt();
			
			System.out.print("ENTER YOUR AGE: ");
			int age = sc.nextInt();
			
			System.out.print("ENTER YOUR GENDER: ");
			char gender = sc.next().charAt(0);
			
			System.out.print("ENTER PHYSICALLY CHALLENGE: ");
			boolean pc = sc.nextBoolean();
			
			System.out.print("ENTER YOUR PCM PERCENTAGE: ");
			float pcmPer = sc.nextFloat();
			
			System.out.println();
			
			PrivateStudentInfo s = new PrivateStudentInfo();
			
			s.setRoll(roll);
			s.setAge(age);
			s.setGender(gender);
			s.isPc();
			s.setPcmPer(pcmPer);
			
			school.studentsDetails(s);
			
			System.out.println();
		}
	}

}
