package com.mainapp;

import java.util.ArrayList;

public class Launch {

    void main(){

        ArrayList<Object> list = new ArrayList<>();

        int k = 9583; // Primitive
        list.add(k);  // Here, Auto convert into object using wrapper class internally
        list.add(1234);
        list.add(1256.5f);
        list.add("XYZ");
        list.add('a');
        list.add(false);

        IO.println(list); // List of data
    }
}
