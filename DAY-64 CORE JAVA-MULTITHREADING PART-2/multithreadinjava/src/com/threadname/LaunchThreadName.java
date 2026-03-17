package com.threadname;

public class LaunchThreadName {

	public static void main(String[] args) {
		
		// MAIN METHOD THREAD NAME PRINT
		System.out.println(Thread.currentThread().getName());
		
		ThreadNaming seven1 = new ThreadNaming();
		ThreadNaming seven2= new ThreadNaming();
		ThreadNaming seven3 = new ThreadNaming();
		
		// 	SET THREAD NAME
		seven1.setName("Ram");
		seven2.setName("Krishna");
		seven3.setName("Shiva");
		
		
		//	SET PRIORITY
		seven1.setPriority(10);
		seven2.setPriority(5);
		seven3.setPriority(1);
		
		
		seven1.start();
		seven2.start();
		seven3.start();

	}

}
