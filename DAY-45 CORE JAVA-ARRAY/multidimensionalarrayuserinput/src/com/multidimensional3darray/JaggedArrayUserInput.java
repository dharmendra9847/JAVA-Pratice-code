package com.multidimensional3darray;

import java.util.Scanner;

public class JaggedArrayUserInput {

	public static void main(String[] args) {
		
		// 3D-ARRAY	|	JAGGED ARRAY	| USER INPUT
		// 2-CLG | 3-DEPT | 4-STD
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER NO. of CLG: ");
		int clg = sc.nextInt();
		
		
		
		int arr[][][] = new int[clg][][];
		
		// INSERT / SET DEPT DATA
		for(int i = 0; i < clg; i++) {
			System.out.print("ENTER NO. OF DEPT IN CLG-" + i + " ");
			int dept = sc.nextInt();
			arr[i] = new int[dept][];
		}
		
		// INSERT / SET STD DATA
		for(int i = 0; i < clg; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print("ENTER NO. OF STD IN "+"CLG-"+ i +" DEPT-" + j + " ");
				int std = sc.nextInt();
				arr[i][j] = new int[std];
			}
		}
		
		// ITERATION by FOR LOOP
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				for(int k = 0; k < arr[i][j].length; k++) {
					
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int arr[][][] = {	
//				
//				{	//CLG-0
//					{10,11,12},		//DEPT-0
//					{14,15,16,17},		//DEPT-1
//					{18,19}		//DEPT-2
//				},
//				{	//CLG-1
//					{22,23,24,25},		//DEPT-0
//					{26,27,28,29},		//DEPT-1
//					{30,31,32}		//DEPT-2
//				}
//		};
		
//		System.out.println(arr[0][1][2]);		// ELEMENT O/P: 21 
//		System.out.println(arr.length);			// ARRAY LENGHT: 2
//		System.out.println(arr[0].length);		// ARRAY DEPT LENGHT: 3
//		System.out.println(arr[0][0].length);	// ARRAY DEPT ELEMENT LENGHT: 4
//		
		// ITERATION by FOR LOOP
//		for(int i = 0; i < arr.length; i++) {
//			
//			for(int j = 0; j < arr[i].length; j++) {
//				
//				for(int k = 0; k < arr[i][j].length; k++) {
//					
//					System.out.print(arr[i][j][k] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("\n");
//		}
//		
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
