package com.synchronizedmethod;

public class Resource {
	
	public synchronized void printer(String name){
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(name + " using printer...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
