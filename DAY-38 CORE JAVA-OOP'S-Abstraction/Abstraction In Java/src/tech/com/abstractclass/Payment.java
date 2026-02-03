package tech.com.abstractclass;

public abstract  class Payment {

    abstract void send();
    abstract void balCheck();
    abstract void miniStmt();
    abstract void last5Trs();

    public void policy(){
        System.out.println("POLICY");
    }
}
