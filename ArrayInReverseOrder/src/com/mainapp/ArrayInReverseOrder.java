package com.mainapp;

import java.util.Scanner;

public class ArrayInReverseOrder {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // SET ARRAY ELEMENTS USING FOR LOOP
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter Array Element : ");
            arr[i] = scanner.nextInt();
        }

        // PRINT ALL ARRAY ELEMENTS IN REVERSE ORDER
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
