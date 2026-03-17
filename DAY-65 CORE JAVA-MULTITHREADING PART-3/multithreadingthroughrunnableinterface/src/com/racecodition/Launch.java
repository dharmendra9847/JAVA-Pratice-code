package com.racecodition;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
			
		
		Account account = new Account();
		Card card = new Card(account);
		
		Thread card1 = new Thread(card);
		Thread card2 = new Thread(card);
		
				
		card1.setName("Arjun");
		card2.setName("Krishna");
		
		
		card1.start();
		card2.start();
		
		
		card1.join();
		card2.join();
		
		System.out.println(account.get());


	}

}
