package com.queueinjava;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInJava {

	public static void main(String[] args) {


		Queue<String> queue = new ArrayDeque<String>();
		
		queue.add("data1");
		queue.add("data2");
		queue.add("data3");
		queue.add("data4");
		queue.add("data5");
		
		System.out.println(queue);
		
		//FOR DATA REMOVE / DELETE
		queue.poll();				// REMOVE: data1 (FIFO: FIRST IN FIRST OUT)
		System.out.println(queue);
		
		System.out.println(queue.peek());		//PEEK: data2
		System.out.println(queue.element());	//ELEMENT: data2
 	}

}
