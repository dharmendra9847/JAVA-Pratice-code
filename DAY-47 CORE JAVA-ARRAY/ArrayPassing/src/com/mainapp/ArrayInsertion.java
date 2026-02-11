package com.mainapp;

public class ArrayInsertion {
    static void main() {

        int[] demo = demo(10);

        // PRINT INDEXED
        for (int i = 0; i < demo.length; i++) {
            System.out.print(+ i + " ");
        }

        System.out.println();

        // PRINT ARRAY
        for(int i : demo){
            System.out.print(i + " ");
        }

    }

    static int[] demo(int size) {
        //Return Array
//        int[] arr = new int[size];
//        return arr;
        return new int[size];   // ANONYMOUS ARRAY

    }
}
