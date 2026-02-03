package com.mainapp;

public class Launch {

    static void main() {

        Gpay gpay = new Gpay(1000);

        gpay = new Gpay(10);
        gpay.send();
    }
}
