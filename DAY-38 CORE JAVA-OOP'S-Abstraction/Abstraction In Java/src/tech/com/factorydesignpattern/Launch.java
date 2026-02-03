package tech.com.factorydesignpattern;

import java.util.Scanner;

public class Launch {

    static void main() {

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Key : ");
            int key = scanner.nextInt();

            Payment pay;
            pay = ObjectFactory.getObject(key);
            if (pay == null){
                System.out.println("You have enter wrong key :)");
            }else {
                pay.send();
                pay.balCheck();
                pay.miniStmt();
                pay.last5Trs();
            }
        }
    }
}
