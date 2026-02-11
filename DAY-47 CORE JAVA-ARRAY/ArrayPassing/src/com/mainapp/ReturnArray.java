package com.mainapp;

public class ReturnArray {

    static void main() {

        int[] demo = demo();

        // PRINT INDEXED USING FOR LOOP
        for (int i = 0; i < demo.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // PRINT ARRAY USING INDEXED FOR LOOP
        for (int i = 0; i < demo.length; i++) {
            System.out.print(demo[i] + " ");
        }
        System.out.println();

        // PRINT ARRAY USING ENHANCED FOR LOOP
        for (int i : demo) {
            System.out.print(i + " ");
        }
    }

    static int[] demo() {
        //Return Array
//        int[] arr = {11,22,33,44,55};
//        return arr;
        return new int[]{11,22,33,44,55}; // ANONYMOUS ARRAY

    }

}
