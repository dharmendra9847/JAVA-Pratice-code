package com.mainapp;

import java.util.Scanner;

public class SumOfDiagonalArray {

    static void main() {

        Scanner sc = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.println("Enter Number Of Rows : ");
        int r = sc.nextInt();

        System.out.println("Enter Number Of Columns : ");
        int c = sc.nextInt();

        // Check if it's a square matrix to have a main diagonal
        if (r != c) {
            System.out.println("The matrix must be a square matrix to have a main diagonal.");
            sc.close();
            return;
        }

        int[][] arr = new int[r][c];

        int sum = 0;

        // Take input for the matrix elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+ i + "th Row Elements : ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] += sc.nextInt();
            }
        }

        System.out.println("Your Matrix Is: ");
        // Print the full matrix for reference
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Print the main (principal) diagonal elements
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i][i] + " ");
            sum += arr[i][i];
        }
        System.out.println("\nSum Of 1st Diagonal Elements is : " + sum);


        // Print the secondary (anti) diagonal elements
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i][r-1-i] + " ");
            sum += arr[i][i];
        }
        System.out.println("\nSum Of 2nd Diagonal Elements is : " + sum);
        sc.close();
    }
}
