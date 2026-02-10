package com.mainapp;

public class Launch {

	public static void main(String[] args) {
		
//		int arr[]= {}; 	// EMPTY ARRAY
		
//		int arr[];
//		arr[] = {};
		
//		int arr[] = {10,11,12,13,14};
//		System.out.println(arr);	// O/P: OBJECT (HEXADECIMAL VALUE)
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		int[] arr = {10,11,12,13,14,15};
		
//		int arr[] = {11,22,33,44,55};
//		int n = arr[4];
		
		// ARRAY ITERATION
//		for(int i = 0; i <= 4; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int l = arr.length;
//		for(int i = 0; i < l; i++) {
//			System.out.println(arr[i]);
//		}
		
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		int arr[] = {12,24,36,48,60};
		
		
		
		// FOR EACH LOOP : ENHANCE FOR LOOP : FROM WHERE, WHAT I,LL GET
		
		for(int k : arr) {
			System.out.println(k);
		}
		
		arr[2] = 800; // UPDATE ELEMENT (INDEX-2)
		
		for(int k : arr) {
			System.out.println(k);
		}
		
		//arr[5] = 1000; 	// Index 5 out of bounds for length 5

	}

}
