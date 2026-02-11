package com.UserInputRegularArray2d;

import java.util.Scanner;

public class UserInputRegularArray2d {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER NO. OF DEPT: ");
		int dept = sc.nextInt();
		
		System.out.print("ENTER NO. OF STD IN EACH DEPT: ");
		int std = sc.nextInt();
		
		int arr[][] = new int[dept][std];
		
		//INSERT DATA IN 2D ARRAY
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("ENTER STD" + j + "IN DEPT" + i + "->");
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		//PRINTING DATA FROM 2D ARRAY
		for(int k[]:arr) {
			for(int elements:k) {
				System.out.print(elements + " ");
			}
			System.out.println();
		}
	}
}
