package com.queueinjava;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInJava {

	public static void main(String[] args) {


		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Rama");
		
		// INSERT DATA FROM FRONT METHOD
		deque.addFirst("data1");
		deque.addFirst("data2");
		
		// INSERT DATA FROM REAR / LAST METHOD
		deque.addLast("data3");
		deque.addLast("data4"); 
		
		System.out.println(deque);
		
		//FOR DATA REMOVE / DELETE
		deque.poll();							// REMOVE: data1
		deque.pollFirst();						// FRONT REMOVE: data2
		deque.pollLast();						// REAR REMOVE: data5
		System.out.println(deque);
		
		System.out.println(deque.peek());		//PEEK: data3
		System.out.println(deque.element());	//ELEMENT: data3
		
		System.out.println(deque.peekFirst());	//peekFirst: data3
		System.out.println(deque.peekLast());	//peekLast: data4
 	}

}
