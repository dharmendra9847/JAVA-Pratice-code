package com.Regular2DArrayrrayMultidimensionalArray;

public class Jagged2DArrayMultidimensionalArray {

	public static void main(String[] args) {
		
		
		// 3DEPT | 4 STD IN EACH DEPT
		
		int arr[][] = {
											
										  	  
				{12,54,55,69,99}, 
				{64,56}, 
				{68,94,85,97,108,158} 
		};
		
		System.out.println("ARRAY LENGTH OF DEPT: " + arr.length);	//	ARRAY LENGTH OF DEPT
		
		System.out.println();
		
		System.out.println("ARRAY LENGTH OF STD INSIDE THE DEPT0: " + arr[0].length); // ARRAY LENGTH OF STD INSIDE THE DEPT0
		System.out.println("ARRAY LENGTH OF STD INSIDE THE DEPT1: " + arr[1].length); // ARRAY LENGTH OF STD INSIDE THE DEPT1
		System.out.println("ARRAY LENGTH OF STD INSIDE THE DEPT2: " + arr[2].length); // ARRAY LENGTH OF STD INSIDE THE DEPT2
		
		System.out.println();
		
		// ITERATION
		for(int i = 0; i < arr.length; i++) { // ITERATION (FROM 0 1 2) DEPT
//			for(int j = 0; j < arr[0].length; j++) { Not Valid for Jagged Array
				for(int j = 0; j < arr[i].length; j++) { 
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// FOR EACH
		System.out.println("FOR EACH ITERATION:");
		for(int k[]:arr) {
			for(int ele:k) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}

}
