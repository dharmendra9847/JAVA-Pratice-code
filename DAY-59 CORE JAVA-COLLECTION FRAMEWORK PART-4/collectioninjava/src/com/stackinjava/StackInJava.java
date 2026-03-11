package com.stackinjava;

import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.add("Krishna");
		stack.add("Arjun");
		stack.add("Ram");
		stack.add("Ajay");
		stack.add("Vjay");
		
		
		System.out.println(stack);
		
				
		stack.push("data1");
		stack.push("data2");
		stack.push("data3");
		stack.push("data4");
		stack.push("data5");
		
		System.out.println(stack);
		
		stack.pop();	// data5 delete hoga na ki data1 // FILO/LIFO
		
		System.out.println(stack.peek());	//data4
		System.out.println(stack);
		
		//BY SEARCH() METHOD IF DATA MISMATCHED
		System.out.println(stack.search(2));	// -1
		System.out.println(stack.search("a"));	// -1
		
		//BY SEARCH() METHOD IF DATA MATCHED
		System.out.println(stack.search("data1"));	// 4
		System.out.println(stack.search("data2"));	// 3
		System.out.println(stack.search("data3"));	// 2
		System.out.println(stack.search("data4"));	// 1
		
		

		
	}

}
