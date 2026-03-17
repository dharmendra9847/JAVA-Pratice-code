package com.mainapp;

public class Table extends Parents implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		if(name.equals("Arjun")) {
			tableOfFive();
		}else if(name.equals("Krishna")) {
			tableOfSeven();
		}else {
			tableOfEleven();
		}
	}
	
	private void tableOfFive() {
		super.test(5);
	}
	private void tableOfSeven() {
		super.test(7);
	}
	private void tableOfEleven() {
		super.test(11);
	}

}
