package com.priorityqueueinjava;

import java.util.ArrayDeque;

public class DeQueue {
	
	public static void main(String [] args) {
		DeQueue.myQueue();
	}
	
	public static void myQueue() {
		
		ArrayDeque<Integer> qeque = new ArrayDeque<Integer>();
		qeque.add(1000);
		qeque.add(2000);
		qeque.add(3000);
		qeque.add(4000);
		qeque.add(6000);
		qeque.add(5000);
		
		System.out.println(qeque);
		
		System.out.println(qeque.poll());
		System.out.println(qeque);
		
		
	}
}
