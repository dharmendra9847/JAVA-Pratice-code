package com.mainapp;

import java.util.Scanner;

public class Launch {
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER SIZE OF AN ARRAY: ");
		
		int size = s.nextInt();
		
		int arr[] = new int[size]; 	// [SIZE OF N->BY USER INPUTS]
		
		// LOOP FOR INSERT ELEMENTS
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter arr[" + i + "] = "); 
			arr[i] = s.nextInt();
		}
		// LOOP FOR PRINT ELEMENTS
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 	
		}
	}
}
