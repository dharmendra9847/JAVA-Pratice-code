package com.priorityqueueinjava;

import java.util.ArrayDeque;
import java.util.TreeSet;

public class Stack {
	
	public static void main(String [] args) {
		Stack.myQueue();
	}
	
	public static void myQueue() {
		
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(1000);
		stack.push(2000);
		stack.push(3000);
		stack.push(4000);
		stack.push(6000);
		stack.push(5000);
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(5);
		treeSet.add(1000);
		treeSet.add(700);
		
		System.out.print(treeSet);
		
		
	}
}
