package task1;

import java.util.Scanner;

public class Lunch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Num-1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Num-2 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				sum += i;
				System.out.print(i);
				if(i != num2) {
					System.out.print(" + ");
				}
			}
			System.out.print(" = " + sum);
		}else {
			System.out.print("You have Enter Invalid Input:) Try Again!");
		}

	}

}
