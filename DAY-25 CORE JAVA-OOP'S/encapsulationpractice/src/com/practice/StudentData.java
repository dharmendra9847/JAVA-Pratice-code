package com.practice;
import java.util.Scanner;
public class StudentData {
	
	// HERE OUR DATA NOT HIDE
	/*
	 * 
	public int roll;
	public int age;
	public char gender;
	public boolean pc;
	public float pcmPercentage;
	
	*/ 
	
	// IF YOU WANT TO YOUR DATA HIDE USE (PRIVATE/PROTACTED KEYWORD)
	// & FOR ACCESSING PRIVATE/PROTACTED DATA USE GETTER AND SETTER 
	private int roll;
	private int age;
	private char gender;
	private boolean pc;
	private float pcmPercentage;
	
	// SETTER 
	public void setData(int roll,int age, char gender, boolean pc, float pcmPercentage) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ENTER YOUR PASSWORD: ");
		int password = scanner.nextInt();
		if(password == 1234) {
			this.roll = roll;
			this.age = age;
			this.gender = gender;
			this.pc = pc;
			this.pcmPercentage = pcmPercentage;
		}else {
			System.out.println("Something Worng!");
		}
	}
	
	// GETTER AND SETTER 
		public void getData() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("ENTER YOUR PASSWORD: ");
			
			int password = scanner.nextInt();
			
			System.out.println();
			System.out.println("***** YOUR DATA IS *****\n");
			
			if(password == 1234) {
				System.out.println("YOUR ROLL NO. IS: " + roll);
				System.out.println("YOUR AGE IS: " + age);
				System.out.println("YOUR GENDER: " + gender);
				System.out.println("PHYSICAL CHALLENGE: " + pc);
				System.out.println("YOUR PCM PERCENTAGE IS: " + pcmPercentage);
				System.out.println();
			}else {
				System.out.println("Something Worng!");
			}
		}
}
