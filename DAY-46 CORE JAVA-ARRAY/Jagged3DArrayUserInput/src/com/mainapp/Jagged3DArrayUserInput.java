package com.mainapp;

import java.util.Scanner;

public class Jagged3DArrayUserInput {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of College : ");
        int college = sc.nextInt();

        int[][][] arr = new int[college][][];

        // Set Department Data in College
        for (int i = 0; i < college; i++) {

            System.out.println("Enter No. DEPT in CLG-> " + i);
            int dept = sc.nextInt();
            arr[i] = new int[dept][];
        }

        // Set Students Data in each Department
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println("Enter No. Students in CLG-> " + i + " DDEPT-> " + j);
                int std = sc.nextInt();
                arr[i][j] = new int[std];
            }
        }

        // Set Data in Matrix
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                for (int k = 0; k < arr[i][j].length; k++) {

                    System.out.println("Enter STD-> " + k + " in DEPT-> " + j + " in CLG-> " + i);
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Print Data Using For Each Loop
        for(int[][] k : arr){
            for (int[] l : k){
                for(int e : l){
                    System.out.print(e + " ");
                }
                System.out.println();
            }
            System.out.println("\n");
        }

        // Print Data Using For Loop
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//
//                for (int k = 0; k < arr[i][j].length; k++) {
//                    System.out.print(arr[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("\n");
//        }
    }
}
