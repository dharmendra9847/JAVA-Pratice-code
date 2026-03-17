
package com.objectlevellockusingoneresources;

public class MyThread extends Thread{
	
	private Test test;
	
	public MyThread(Test test) {
		this.test=test;
	}
	
	@Override
	public void run() {
	
		test.printer(currentThread().getName());
		
	}	
}




