package com.multithreadingthroughrunnable;

public class Seven implements Runnable{

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
//		System.out.println(name);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(name + " : " + (7 * i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
