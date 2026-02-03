package com.mainapp;

public class Gpay {

    private int a;
    private static int b;

    static  {
        b = 2000;
    }

    public Gpay(int a){
        this.a = a;
    }

    protected void send(){
        System.out.println("G-PAY SEND -> " + a + " | " + b);
    }
}
