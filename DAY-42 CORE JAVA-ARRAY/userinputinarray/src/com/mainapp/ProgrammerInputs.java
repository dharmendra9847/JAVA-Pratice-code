package com.mainapp;

import java.util.Scanner;

public class ProgrammerInputs {
	public static void main(String args[]){
		
		//ELEMENT: User
		int arr[] = new int[5]; // [SIZE OF 5]
		
		System.out.println(arr);	// OBJECT: [I@24d46ca
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 	// DEFAULT VALUE
		}
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 	// 10 20 30 40 50
		}
 	}
}
