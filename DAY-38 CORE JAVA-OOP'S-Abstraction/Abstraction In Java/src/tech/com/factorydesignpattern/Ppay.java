package tech.com.factorydesignpattern;

public class Ppay implements Payment {

    @Override
    public void send() {
        System.out.println("P-pay Send");
    }

    @Override
    public void balCheck() {
        System.out.println("P-pay Balance Check");

    }

    @Override
    public void miniStmt() {
        System.out.println("P-pay MiniStatement");

    }

    @Override
    public void last5Trs() {
        System.out.println("P-pay Last 5 Transaction");

    }
}
