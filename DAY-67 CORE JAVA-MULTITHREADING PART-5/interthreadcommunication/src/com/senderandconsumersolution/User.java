package com.senderandconsumersolution;

public class User extends Thread{
	
	private Message message;
	
	public User(Message message) {
		this.message=message;
	}
	
	@Override 
	public void run() {
		
		String name = currentThread().getName();
		
		if(name.equals("Ram")) {
			
			for(int i = 1; i <= 5; i++) {
				message.sendMessage("Hello- " + i);
			}
			
		}else {
			
			for(int i = 1; i <= 5; i++) {
				message.readMessage();
			}
		}
	}
}
