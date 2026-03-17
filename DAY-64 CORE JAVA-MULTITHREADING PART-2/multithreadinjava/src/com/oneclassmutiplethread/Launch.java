package com.oneclassmutiplethread;

public class Launch {

	public static void main(String[] args) {
		
		OneClassMutipleThread five1 = new OneClassMutipleThread();
		OneClassMutipleThread five2= new OneClassMutipleThread();
		OneClassMutipleThread five3 = new OneClassMutipleThread();
		
		five1.start();
		five2.start();
		five3.start();

	}

}
