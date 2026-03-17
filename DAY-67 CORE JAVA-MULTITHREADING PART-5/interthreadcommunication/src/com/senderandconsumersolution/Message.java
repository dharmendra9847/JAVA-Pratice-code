package com.senderandconsumersolution;

public class Message {
	
	private String message;
	private boolean isSent;
	
	public synchronized void sendMessage(String message) {
		
		while(isSent==true) {
			
			try {
				wait();		// WAIT STATE
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(message + " send by Ram");
		this.message=message;
		
		isSent=true;
		notify();	// WAKES UP OTHER THREAD ON CURRENT OBJECT
	}
	public synchronized void readMessage() {
		
		while(isSent==false) {
			
			try {
				wait();		// WAIT STATE
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(message + " read by Sita");
		
		isSent=false;
		notify();	// WAKES UP OTHER THREAD ON CURRENT OBJECT
	}
}
