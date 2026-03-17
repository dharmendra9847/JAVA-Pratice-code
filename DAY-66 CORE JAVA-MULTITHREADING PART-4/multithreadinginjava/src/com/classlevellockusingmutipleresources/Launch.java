package com.classlevellockusingmutipleresources;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		Test test1 = new Test();
		Test test2 = new Test();
		
		MyThread t1 = new MyThread(test1, test2);
		MyThread t2 = new MyThread(test1, test2);
		
		t1.setName("Ram");
		t2.setName("Sita");
		
		t1.start();
		t2.start();
	}

}
