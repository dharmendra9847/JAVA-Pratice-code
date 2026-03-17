package com.deadlockcondition;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
				
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("Ram");
		t2.setName("Sita");
		
		t1.start();
		t2.start();
	}

}
