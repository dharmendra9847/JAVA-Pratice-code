package com.mainapp;

import java.util.Scanner;

public class JaggedArrayUserInput {

	public static void main(String[] args) {

		//	WITHOUT USER INPUT
		int arr[][] = new int [3][];
		
		//	FOR INSERT STD DATA BY MANUAL (XXX) 
		arr[0] = new int[5];	//	DEPT-0		STD-5
		arr[0] = new int[2];	//	DEPT-1		STD-2
		arr[0] = new int[3];	//	DEPT-2		STD-3
		
		
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("ENTER NO. OF DEPT: ");
 		int dept = sc.nextInt();
 		
 		int myArr[][] = new int [dept][];
 		
 		// 		SET STD DATA 
 		for(int i = 0; i < dept; i++) {
 			System.out.print("ENTER NO. OF STD IN DEPT-" + i + " ");
 			int std = sc.nextInt();
 			myArr[i] = new int [std];
 		}

 		// 		FOR INSERT STD DATA IN DETP WISE
 		for(int i = 0; i < myArr.length; i++) {
 			for(int j = 0; j < myArr[i].length; j++) {
 				System.out.print("ENTER STD " + j + " IN DEPT" + i + "->");
 				myArr[i][j] = sc.nextInt();
 			}
 			System.out.println();
 		}
 		
 		// 		FOR PRINT STD DATA FROM DEPT
 		for(int i = 0; i < myArr.length; i++) {
 			for(int j = 0; j < myArr[i].length; j++) {
 				System.out.print(myArr[i][j] + " ");
 			}
 			System.out.println();
 		}
 		
 		//	FOR PRINT STD DATA FROM DEPT
// 		for(int k[]: myArr) {
// 			for(int elements : k) {
// 				System.out.print(elements + " ");
// 			}
// 			System.out.println();
// 		}
	}

}
