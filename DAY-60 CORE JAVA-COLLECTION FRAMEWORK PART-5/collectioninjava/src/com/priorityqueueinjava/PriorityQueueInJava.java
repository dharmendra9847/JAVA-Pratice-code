package com.priorityqueueinjava;

import java.util.PriorityQueue;

public class PriorityQueueInJava {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(500);
		pq.add(10);
		pq.add(5);
		pq.add(250);
		pq.add(900);
		pq.add(120);
		pq.add(10);
		pq.add(800);
		pq.add(150);
		pq.add(250);
		pq.add(1);
		pq.add(1);
		
//		System.out.println(pq);
		
//		pq.remove();	//1
//		System.out.println(pq);
//		
//		pq.poll();		//2
//		System.out.println(pq);
		
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Ram");
		priorityQueue.add("Rahim");
		priorityQueue.add("Chandani");
		priorityQueue.add("Neha");
		priorityQueue.add("Dharmendra");
		priorityQueue.add("Shiva");
		priorityQueue.add("Raju");
		priorityQueue.add("Aryan");
		priorityQueue.add("Diwakar");
		priorityQueue.add("Shreshth");
		priorityQueue.add("Aditya");
		
		System.out.println(priorityQueue);
 	}

}