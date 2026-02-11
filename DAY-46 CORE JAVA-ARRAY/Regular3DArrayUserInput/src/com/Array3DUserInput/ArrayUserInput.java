package com.Array3DUserInput;

import java.util.Scanner;

public class ArrayUserInput {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of College : ");
        int col = sc.nextInt();

        System.out.println("Enter No. of Department : ");
        int dept = sc.nextInt();

        System.out.println("Enter No. of Students in Each Department : ");
        int std = sc.nextInt();

        int[][][] arr = new int[col][dept][std];

        // Set data
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("Enter STD - " + k + " in CLG - " + i + " DEPT - " + j + " ");
                    arr[i][j][k] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
       }

        System.out.println("Your College Details : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
