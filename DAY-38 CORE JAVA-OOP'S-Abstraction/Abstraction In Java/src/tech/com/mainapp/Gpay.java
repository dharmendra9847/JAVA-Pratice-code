package tech.com.mainapp;

public class Gpay implements Payment {

    @Override
    public void send() {
        System.out.println("G-pay Send");
    }

    @Override
    public void balCheck() {
        System.out.println("G-pay Balance Check");

    }

    @Override
    public void miniStmt() {
        System.out.println("G-pay MiniStatement");

    }

    @Override
    public void last5Trs() {
        System.out.println("G-pay Last 5 Transaction");

    }
}
