package com.multitpleinheritancachievedthroughrunnableinterface;

public class Parents {
	
	public void test1() {

		String name = Thread.currentThread().getName();
//		System.out.println(name);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(name + " : " + (5 * i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void test2() {
		
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
