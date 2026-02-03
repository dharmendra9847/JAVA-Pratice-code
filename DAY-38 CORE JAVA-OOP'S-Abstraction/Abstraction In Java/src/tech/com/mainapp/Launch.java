package tech.com.mainapp;

public class Launch {

    static void main() {

        Payment pay;

        System.out.println("\n****** G-pay ******");
        pay = new Gpay();
        pay.send();
        pay.balCheck();
        pay.miniStmt();
        pay.last5Trs();

        System.out.println("\n****** P-pay ******");
        pay = new Ppay();
        pay.send();
        pay.balCheck();
        pay.miniStmt();
        pay.last5Trs();

        System.out.println("\n****** C-pay ******");
        pay = new Cpay();
        pay.send();
        pay.balCheck();
        pay.miniStmt();
        pay.last5Trs();

    }
}
