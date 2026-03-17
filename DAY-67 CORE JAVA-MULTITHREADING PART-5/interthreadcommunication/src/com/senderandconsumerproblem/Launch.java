package com.senderandconsumerproblem;

public class Launch {

	public static void main(String[] args) {
		
		Message message = new Message();
		
		User user1 = new User(message);
		User user2 = new User(message);
		
		user1.setName("Ram");
		user2.setName("Sita");
		
		user1.start();
		user2.start();
	}

}
