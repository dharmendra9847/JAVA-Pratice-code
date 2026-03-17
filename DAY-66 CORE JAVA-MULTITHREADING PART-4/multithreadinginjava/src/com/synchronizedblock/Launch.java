package com.synchronizedblock;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		Test test = new Test();
		
		MyThread t1 = new MyThread(test);
		MyThread t2 = new MyThread(test);
		
		t1.setName("Ram");
		t2.setName("Sita");
		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(test.getCount());
		System.out.println("OVERLAP COUNT: " + (test.getCount() - test.getRace()));
	}

}
