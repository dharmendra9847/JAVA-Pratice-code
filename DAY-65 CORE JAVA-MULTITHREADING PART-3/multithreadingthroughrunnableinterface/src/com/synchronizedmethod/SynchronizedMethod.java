package com.synchronizedmethod;

public class SynchronizedMethod {

	public static void main(String[] args) throws InterruptedException {
		
		Resource resource = new Resource();
		Print print = new Print(resource);
		
		Thread p1 = new Thread(print);
		Thread p2 = new Thread(print);
		
		p1.setName("Ram");
		p2.setName("Sita");
		
		p1.start();
		p2.start();
				
		p1.join();
		p2.join();
		
	}

}
