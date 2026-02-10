package com.mainapp;

import java.util.Scanner;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {
		
		//SUM OF ALL ELEMENTS IN ARRAY
		int arr[] = {10,11,12,13,14};
		
		int sum = 0; 
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");

		int size = s.nextInt();
		
		int arr1[] = new int[size];
		
		// LOOP FOR INSERT DATA
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter arr[" + i + "] = ");
			arr[i] = s.nextInt();
		}
		
		// LOOP FOR PRINT ADD
		int add = 0;
		for(int i = 0; i < size; i++) {
			add = add + arr[i];
		}
		System.out.println(add);
	}

}
