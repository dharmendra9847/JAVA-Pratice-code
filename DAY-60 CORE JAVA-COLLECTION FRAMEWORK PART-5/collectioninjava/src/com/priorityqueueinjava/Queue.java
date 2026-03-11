package com.priorityqueueinjava;

import java.util.ArrayDeque;

public class Queue {
	
	public static void main(String [] args) {
		Queue.myQueue();
	}
	
	public static void myQueue() {
		
		ArrayDeque<Integer> deQeque = new ArrayDeque<Integer>();
		deQeque.addFirst(1000);
		deQeque.addFirst(2000);
		deQeque.addLast(3000);
		deQeque.addLast(4000);
		deQeque.addFirst(6000);
		deQeque.addLast(5000);
		
		System.out.println(deQeque);
		
		System.out.println(deQeque.peek());
		
		System.out.println(deQeque.poll()); 
		System.out.println(deQeque);
		
		System.out.println(deQeque.peekFirst());
		System.out.println(deQeque.peekLast());
		
		System.out.println(deQeque.pollFirst());
		System.out.println(deQeque.peekLast());
		
		
	}
}
