package javacontrolstatement;
//import java.util.Scanner;
//import java.util.*;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String myName = "Dharmendra";
		// System.out.println("Hello " + myName);
		
		
		/* Simple if Statement */
		/*
		
		int marks = 60;
		
		if(marks >= 60) {
			System.out.println("You are eligible for NEET!");
		}else if(marks >= 50) {
			System.out.println("You are not eligible for NEET!");
			
		}else if(marks >= 45) {
			System.out.println("You are eligible for JEE!");
		}else {
			System.out.println("something wrong!");
		}
		
		*/
		
		/*	Compile time error 
		 
		 	
		int age = 29;

		if(age >= 60);{
			System.out.println("You are in bachlor");
		}else if(age >= 50) {
			System.out.println("You are Old man");
		}else;{
			System.out.println("something wrong!");
		}
		
		*/
			
		/* 		User Input 		*/
		
		Scanner	scan =	new Scanner(System.in);
		
		// 1. 	Byte Value
//		System.out.print("ENTER A DEMO BYTE VALUE: ");
		byte	b = scan.nextByte();
//		System.out.print(b);
		
		// 2.	short value
		short s = scan.nextShort();
		
		// 3.	int value
		int i	= scan.nextInt();
		
		// 4. 	long value
		long l = scan.nextLong();
		
		
		// 5.	float 
		float f = scan.nextFloat();
		
		// 6.	double
		double d = scan.nextDouble();
				
		// 7.	boolean
		boolean bool  = scan.nextBoolean();
		
		// 8. 	char
		char c = scan.next().charAt(0);
				
		
		
		/* 	Nested if-else statement 	*/
		
//		Scanner	scan =	new Scanner(System.in);
		
		System.out.print("ENETR YOUR PERCENTAGE: ");
		byte per = scan.nextByte();
		
		System.out.print("ENTER YOUR TC CERTIFICATE: ");
		char tc = scan.next().charAt(0);
		
		System.out.print("ENTER YOUR PCM PERCENTAGE: ");
		byte pcm = scan.nextByte();
		
		
		if(per >=60) {
			if(tc == 'Y' || tc== 'y') {
				if(pcm >=50) {
					System.out.println("You are eligible for admission!");
				}else {
					System.out.println("Your PCM percentage is low: Yor are not Eligilbe for admission!");
				}
			}else {
				System.out.println("Your TC Certificate is not valid: You Are Not Eligible for admission!");
			}
		}else {
			System.out.println("Your Overall percentage is low: You Are Not Eligible for admission");
		}
	}

}
