package com.tableofnumber;

public class Five extends Thread{

	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(5 * i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
