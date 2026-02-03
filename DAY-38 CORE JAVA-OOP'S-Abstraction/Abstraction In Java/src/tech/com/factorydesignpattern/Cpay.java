package tech.com.factorydesignpattern;

public class Cpay implements Payment {

    @Override
    public void send() {
        System.out.println("C-pay Send");
    }

    @Override
    public void balCheck() {
        System.out.println("C-pay Balance Check");

    }

    @Override
    public void miniStmt() {
        System.out.println("C-pay MiniStatement");

    }

    @Override
    public void last5Trs() {
        System.out.println("C-pay Last 5 Transaction");

    }
}
