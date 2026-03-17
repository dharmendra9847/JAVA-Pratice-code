package com.tasktableofnumber;

import java.util.Scanner;

public class Eleven extends Thread{
	
	@Override
	public void run() {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Number: ");
			int num = scanner.nextInt();
			
			for(int i = 1; i <= 10; i++) {
				System.out.println(num * i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
