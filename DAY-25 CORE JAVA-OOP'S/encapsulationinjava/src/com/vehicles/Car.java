package com.vehicles;

import java.util.Scanner;

public class Car {
	
	// DTO -> DATA TRANSFER OBJECT [Data Transfer Object (DTO)]
	// POJO -> Plain Old Java Object [POJO (Plain Old Java Object)]
	public void testCar(CarInfo c) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER YOUR PASSWORD: ");
			int password = sc.nextInt();
			if(password == 12345) {		
				System.out.println("MODEL NAME: " + c.getModelName());
				System.out.println("MODEL NAME: " + c.getModelNumber());
				System.out.println("MODEL NAME: " + c.getColor());
				System.out.println("MODEL NAME: " + c.getEngine());
				System.out.println("MODEL NAME: " + c.getMilage());
				System.out.println("MODEL NAME: " + c.getSpace());
			}else {
				System.out.println("INCORRECT PASSWORD ! PLEASE ENTER A VALID PASSWORD");
			}
		}
	}
}
