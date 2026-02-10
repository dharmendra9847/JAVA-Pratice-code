package com.practice;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter No. of Employee: ");
		int count = s.nextInt();
		
		
		Employee err[] = new Employee[count];
		
		for(int i = 0; i < count; i++) {
			System.out.print("Enter ID: ");
			int id = s.nextInt();
			
			System.out.print("Enter AGE: ");
			byte age = s.nextByte();
			
			System.out.print("Enter HEIGHT: ");
			float height = s.nextFloat();
			
			
			Employee e = new Employee(id, age, height);
			
			err[i] = e;
		}
		
		//FETCH
		for(Employee res : err) {
			System.out.print("ID: " + res.geteId() + " ");
			System.out.print("AGE: " + res.getAge() +" ");
			System.out.println("HEIGHT: " + res.getHeight() + " ");
		}
	}
}
