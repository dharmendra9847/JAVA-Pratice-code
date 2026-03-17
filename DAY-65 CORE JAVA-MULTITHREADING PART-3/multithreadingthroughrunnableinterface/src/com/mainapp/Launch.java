package com.mainapp;

public class Launch {

	public static void main(String[] args) {
		
		System.out.println("MAIN METHOD START");
		
		Table table = new Table();
		
		Thread t1 = new Thread(table);
		Thread t2 = new Thread(table);
		Thread t3 = new Thread(table);
		
		
		t1.setName("Arjun");
		t2.setName("Krishna");
		t3.setName("Ram");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("MAIN METHOD EXIT");

	}

}
