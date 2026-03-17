
package com.classlevellockusingmutipleresources;

public class MyThread extends Thread{
	
	private Test test1;
	private Test test2;
	
	public MyThread(Test test1, Test test2) {
		this.test1=test1;
		this.test2=test2;
	}
	
	@Override
	public void run() {
	
		String name = currentThread().getName();
		
		if(name.equals("Ram")) {
			test1.printer(name);
		}else {
			test2.printer(name);
		}
		
	}	
}




