package com.multithreadingthroughrunnable;

public class Lunch {

	public static void main(String[] args) {

		Five five = new Five();					// RUNNABLE TARGET
		Thread thread1 = new Thread(five);		// THREAD CREATED
		
		
		Seven seven = new Seven();					// RUNNABLE TARGET
		Thread thread2 = new Thread(seven);		// THREAD CREATED
		
		// THREAD NAME SET
		thread1.setName("Arjun");
		thread2.setName("Karan");
		
		// PRIORITY SET USING CONSTANT
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		thread2.start();
	}

}
