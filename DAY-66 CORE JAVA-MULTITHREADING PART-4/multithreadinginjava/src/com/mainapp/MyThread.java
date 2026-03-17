
package com.mainapp;

public class MyThread extends Thread{
	
	private Test test;
	
	public MyThread(Test test) {
		this.test=test;       
	}                     
	
	@Override
	public void run() {
	
		for(int i = 1; i <= 100000; i++) {
			test.change();
		}
	}
	
}




