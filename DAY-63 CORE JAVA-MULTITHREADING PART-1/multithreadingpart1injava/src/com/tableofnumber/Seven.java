package com.tableofnumber;

public class Seven extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(7 * i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
