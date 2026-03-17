package com.threadname;

public class ThreadNaming extends Thread{
	
	@Override
	public void run() {
		
		Thread thread = currentThread();
		String name = thread.getName();
		
		seven(name);
	}
	
	public void seven(String name) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(name + ":" + (7 * i));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
