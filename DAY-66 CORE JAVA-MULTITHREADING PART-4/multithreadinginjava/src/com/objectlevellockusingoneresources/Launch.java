package com.objectlevellockusingoneresources;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		Test test = new Test();
		
		MyThread t1 = new MyThread(test);
		MyThread t2 = new MyThread(test);
		
		t1.setName("Ram");
		t2.setName("Sita");
		
		t1.start();
		t2.start();
	}

}
