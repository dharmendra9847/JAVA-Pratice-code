package com.mainapp;

import java.util.Scanner;

public class ArraySumOfAllElements {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        int sum = 0;
        // SET ARRAY ELEMENTS USING FOR LOOP
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter Array Element : ");
            arr[i] = scanner.nextInt();
        }

        // PRINT ALL ARRAY ELEMENTS IN REVERSE ORDER
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.print("Sum Of All Array Elements is: " + sum);
    }
}
