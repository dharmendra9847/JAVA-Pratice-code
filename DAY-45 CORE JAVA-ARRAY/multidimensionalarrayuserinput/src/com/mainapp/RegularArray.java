package com.mainapp;

public class RegularArray {

	public static void main(String[] args) {
		
		// 2D-ARRAY | REGULAR ARRAY
		// 1-CLG | 3-DEPT | 4-STD
		
		int arr[][] = {	//CLG-0
				{10,11,12,13},		//DEPT-0
				{14,15,16,17},		//DEPT-1
				{18,19,20,21}		//DEPT-2
		};
		
		System.out.println(arr[0][2]);		// ELEMENT O/P: 12
		System.out.println(arr.length);			// ARRAY LENGHT: 3 
		System.out.println(arr[0].length);		// ARRAY DEPT ELEMENT LENGHT: 4
		
		// ITERATION by FOR LOOP
//		for(int i = 0; i < arr.length; i++) {
//			
//			for(int j = 0; j < arr[0].length; j++) {
//					
//					System.out.print(arr[i][j] + " ");
//				}
//				System.out.println();
//		}
		
		// ITERATION by FOR-EACH LOOP
		for(int k[] : arr) {
			
				for(int ele : k) {
					
					System.out.print(ele + " ");
				}
				System.out.println();
		}
	}
}
