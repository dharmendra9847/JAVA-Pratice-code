package com.mainapp;

public class ArrayPassing {

    static void main() {

        int[] arr = {11,22,33,44,55};
        sol(arr);

    }

    static void sol(int[] arr) {
        // TASK
        for(int i : arr){
            System.out.print(i + " ");
        }
        // RETURN SOL
    }
}
