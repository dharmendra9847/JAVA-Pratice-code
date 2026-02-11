package com.Regular2DArrayrrayMultidimensionalArray;

public class Regular2DArrayMultidimensionalArray {

	public static void main(String[] args) {
		
		
		// 3DEPT | 4 STD IN EACH DEPT
		
		int arr[][] = {
											//    0       1       2       3 
										  	  // i,j	 i,j	 i,j	 i,j
				{12,54,55,69}, //DEPT0	=>0		[0,0]	[0,1]	[0,2]	[0,3]
				{64,56,89,75}, //DEPT1	=>1		[1,0]	[1,1]	[1,2]	[1,3]
				{68,94,85,97}  //DEPT2	=>2 	[2,0]	[2,1]	[2,2]	[2,3]
		};
		
		System.out.println(arr.length);	//	ARRAY LENGTH OF DEPT
		
		System.out.println(arr[0].length); // ARRAY LENGTH OF STD INSIDE THE DEPT0
		System.out.println(arr[1].length); // ARRAY LENGTH OF STD INSIDE THE DEPT1
		System.out.println(arr[2].length); // ARRAY LENGTH OF STD INSIDE THE DEPT2
		
		// 
						
		System.out.print(arr[0][0] + " "); // 0 0 -> 12
		System.out.print(arr[0][1] + " "); // 0 1 -> 54
		System.out.print(arr[0][2] + " "); // 0 2 -> 55
		System.out.print(arr[0][3] + " "); // 0 3 -> 69
		System.out.println();
		
		System.out.print(arr[1][0] + " "); // 1 0 -> 64
		System.out.print(arr[1][1] + " "); // 1 1 -> 56
		System.out.print(arr[1][2] + " "); // 1 2 -> 89
		System.out.print(arr[1][3] + " "); // 1 3 -> 75
		System.out.println();
		
		System.out.print(arr[2][0] + " "); // 2 0 -> 68
		System.out.print(arr[2][1] + " "); // 2 1 -> 94
		System.out.print(arr[2][2] + " "); // 2 2 -> 85
		System.out.println(arr[2][3] + " "); // 2 3 -> 97
		System.out.println();
		System.out.println("***********");
		
		
		// ITERATION
		for(int i = 0; i < arr.length; i++) { // ITERATION (FROM 0 1 2) DEPT
			for(int j = 0; j < arr[0].length; j++) { // ITERATION (FROM 0 1 2 3) STD INSIDE THE DEPT
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		 * 									//    0       1       2       3 
										  	  // i,j	 i,j	 i,j	 i,j
				{12,54,55,69}, //DEPT0	=>0		[0,0]	[0,1]	[0,2]	[0,3]
				{64,56,89,75}, //DEPT1	=>1		[1,0]	[1,1]	[1,2]	[1,3]
				{68,94,85,97}  //DEPT2	=>2 	[2,0]	[2,1]	[2,2]	[2,3]
		 * 
		 * */
	}

}
