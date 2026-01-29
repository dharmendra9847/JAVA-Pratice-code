package com.start;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {

		// CREAT A MENU

		/*
		 * ***** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM *****
		 * 
		 * Press-1: Add Employee Press-2: Read All Employee Press-3: Delete Single
		 * Employee Press-4: Update Single Employee Press-5: Exit
		 * 
		 * Enter Your Choice:
		 * 
		 * HINT: Scanner, SOP, Switch
		 * 
		 */

		while (true) {

			// GREETINGS
			System.out.println("***** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM *****\n");

			System.out.println("Press-1: Add Employee\n" + "Press-2:Read All Employee\n"
					+ "Press-3: Delete Single Employee\n" 
					+ "Press-4: Update Single Employee\n" 
					+ "Press-5: Exit\n");

			Scanner scan = new Scanner(System.in);

			System.out.print("ENTER YOUR CHOICE: ");
			int choice = scan.nextInt();

			if(choice == 5) {
				System.out.println("Thank You For Using!!!");
				break;
			}
			
			
			switch (choice) {
			case 1:
				System.out.println("Add Employee\n");
				break;
			case 2:
				System.out.println("Read All Employee\n");
				break;
			case 3:
				System.out.println("Delete Single Employee\n");
				break;
			case 4:
				System.out.println("Update Single Employee\n");
				break;
			default:
				System.out.println("Invalid choice. Please try again!!!\n");
			} //End of switch
		} //End of while
	} //End of main

}
