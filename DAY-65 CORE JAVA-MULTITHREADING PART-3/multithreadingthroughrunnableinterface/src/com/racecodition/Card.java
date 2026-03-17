package com.racecodition;

public class Card implements Runnable{

	private Account acc;
		
	public Card(Account acc) {
		this.acc=acc;
	}

	@Override
	public void run() {
		
		for(int i=1; i<=100000; i++) {
			acc.change();
		}
	}

}
