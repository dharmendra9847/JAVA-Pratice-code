package com.mainapp;

public class Launch {

    void main(){

        // Manual Boxing
        int k = 1235; // Primitive
        Integer i = new Integer(k);
        IO.println(i);

        // Manual Unboxing
        int num = i.intValue();
        IO.println(num);

        // Auto Boxing
        int num1 = 100;
        Integer r = num1;
        IO.println(r);

        // Auto Unboxing
        int q = r;
        IO.println(r);


    }
}
