package com.senderandconsumerproblem;

public class Message {
	
	private String message;
	
	public synchronized void sendMessage(String message) {
		System.out.println(message + " send by Ram");
		this.message=message;
	}
	public synchronized void readMessage() {
		
		System.out.println(message + " read by Sita");
	}
}
