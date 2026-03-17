package com.objectlevellockusingtworesources;

public class Test {
	
	public void printer(String name) {
		
		synchronized (this) {
			for(int i = 1; i <= 10; i++) {
				System.out.println(name + " using printer...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
