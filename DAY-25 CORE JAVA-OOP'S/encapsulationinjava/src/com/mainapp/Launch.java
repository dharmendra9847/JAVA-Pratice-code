package com.mainapp;
import java.util.Scanner;
import com.schoolmanagement.*;
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			
			System.out.println("[ ***** DAY - 25 | WELCOME TO ECAPSULATION IN JAVA ***** ]\n");
			
			SchoolManagement school = new SchoolManagement();
			
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
			
			
			StudentsInfo s = new StudentsInfo();
			s.roll = roll;
			s.age = age;
			s.gender = gender;
			s.pc = pc;
			s.pcmPer = pcmPer;;
			
			school.studentsDetails(s);
			
			System.out.println("EXIT\n");
		}
		
	}

}
