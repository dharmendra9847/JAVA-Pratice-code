package com.mainapp;

public class Parents {
	
		
	public void test(int number) {
			
		String name = Thread.currentThread().getName();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(name + " : " + (number * i));
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
