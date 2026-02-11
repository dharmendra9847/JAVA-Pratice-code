package com.multidimensional3darray;

import java.util.Scanner;

public class RegularArrayUserInput {

	public static void main(String[] args) {
		
		// 3D-ARRAY	|	REGULAR ARRAY	|	USER INPUT
		// 2-CLG | 3-DEPT | 4-STD
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER NO. of CLG: ");
		int clg = sc.nextInt();
		
		System.out.print("ENTER NO. of DEPT: ");
		int dept = sc.nextInt();
		
		System.out.print("ENTER NO. of STD: ");
		int std = sc.nextInt();
		
		int arr[][][] = new int[clg][dept][std];
		
		
		// ITERATION by FOR LOOP
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[0].length; j++) {
				
				for(int k = 0; k < arr[0][0].length; k++) {
					
					System.out.print("ENTER NO. OF STD-" + k + " IN CLG-"+i+" IN DEPT-"+j+" :-> ");
					
					arr[i][j][k] = sc.nextInt();
				}
				System.out.println();
			}
			System.out.println("\n");
		}
		
		// ITERATION by FOR-EACH LOOP
		for(int k[][] : arr) {
			
			for(int l[] : k) {
				
				for(int ele : l) {
					
					System.out.print(ele + " ");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		int arr[][][] = {	
//				
//				{	//CLG-0
//					{10,11,12,13},		//DEPT-0
//					{14,15,16,17},		//DEPT-1
//					{18,19,20,21}		//DEPT-2
//				},
//				{	//CLG-1
//					{22,23,24,25},		//DEPT-0
//					{26,27,28,29},		//DEPT-1
//					{30,31,32,33}		//DEPT-2
//				}
//		};
//		
//		System.out.println(arr[0][2][3]);		// ELEMENT O/P: 21 
//		System.out.println(arr.length);			// ARRAY LENGHT: 2
//		System.out.println(arr[0].length);		// ARRAY DEPT LENGHT: 3
//		System.out.println(arr[0][0].length);	// ARRAY DEPT ELEMENT LENGHT: 4
//		
		// ITERATION by FOR LOOP
//		for(int i = 0; i < arr.length; i++) {
//			
//			for(int j = 0; j < arr[0].length; j++) {
//				
//				for(int k = 0; k < arr[0][0].length; k++) {
//					
//					System.out.print(arr[i][j][k] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("\n");
//		}
		
		// ITERATION by FOR-EACH LOOP
//		for(int k[][] : arr) {
//			
//			for(int l[] : k) {
//				
//				for(int ele : l) {
//					
//					System.out.print(ele + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("\n");
//		}
	}
}
