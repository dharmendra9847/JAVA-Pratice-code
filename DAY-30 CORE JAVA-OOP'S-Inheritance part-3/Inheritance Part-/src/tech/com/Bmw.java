package tech.com;

public class Bmw extends Car {

    private int a = 3000;

    @Override
    public void text(){

        super.test();
        // this.test();

        int a = 1000;

        System.out.println("Child Class Method");

        System.out.println(a);          // 1000
        System.out.println(this.a);     // 5000
        System.out.println(this.a);     // 3000

        System.out.println(super.a);    // 5000
    }

}
