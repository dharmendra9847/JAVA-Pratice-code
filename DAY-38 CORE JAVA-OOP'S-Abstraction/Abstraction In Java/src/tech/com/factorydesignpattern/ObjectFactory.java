package tech.com.factorydesignpattern;

public class ObjectFactory {

    public static Payment getObject(int key){

        if (key == 1111){
            System.out.println("\n****** G-pay ******");
            return new Gpay();
        } else if (key == 2222) {
            System.out.println("\n****** P-pay ******");
            return new Ppay();
        } else if (key == 3333) {
            System.out.println("\n****** C-pay ******");
            return new Cpay();
        }else {
            return null;
        }
    }
}
