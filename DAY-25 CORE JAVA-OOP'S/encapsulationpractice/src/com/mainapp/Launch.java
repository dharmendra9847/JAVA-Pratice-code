package com.mainapp;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// IF 5 PARAMETER THAN USE PARAMETER
		School school = new School();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ENTER YOUR ROLL NO.: ");
		int roll = scanner.nextInt();
		
		System.out.print("ENTER YOUR AGE: ");
		int age = scanner.nextInt();
		
		System.out.print("ENTER YOUR GENDER: ");
		char gender = scanner.next().charAt(0);
		
		
		System.out.print("ENTER PHYSICAL DISABILTY IF(T/F): ");
		boolean pc = scanner.nextBoolean();
		
		System.out.print("ENTER YOUR PCM PERCENTAGE: ");
		float pcmPercentage = scanner.nextFloat();
		
		// (BUT) IF 500 PARAMETER THAN WHAT
	}

}
