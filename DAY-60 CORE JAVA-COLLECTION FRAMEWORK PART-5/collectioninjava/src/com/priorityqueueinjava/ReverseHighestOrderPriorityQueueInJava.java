package com.priorityqueueinjava;

import java.util.Collections;
import java.util.PriorityQueue;

public class ReverseHighestOrderPriorityQueueInJava {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		pq.add(500);
		pq.add(10);
		pq.add(5);
		pq.add(250);
		pq.add(900);
		pq.add(120);
		pq.add(1);
		pq.add(800);
		pq.add(150);
		pq.add(2);
		
		System.out.println(pq);
		
		pq.remove();	//1
		System.out.println(pq);
		
		pq.poll();		//2
		System.out.println(pq);
 	}

}