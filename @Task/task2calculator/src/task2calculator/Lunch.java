package task2calculator;

import java.util.Scanner;

public class Lunch {

	public static void main(String[] args) {
		
		System.out.println("****** WELCOME TO CALCULATE ANYTHING *******");
		
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		
		while(true) {
			System.out.println("PRESS-1: ADD");
			System.out.println("PRESS-2: SUB");
			System.out.println("PRESS-3: MUL");
			System.out.println("PRESS-4: DIV");
			System.out.println("PRESS-5: EXIT\n");
			
			
			System.out.println("What do you want to perform?");
			int choice = sc.nextInt();
			
			if(choice == 5) {
				System.out.println("Thank You For Using This Calculator!");
				break;
			}
			
			System.out.println("Enter Num-1");
			float num1 = sc.nextInt();
			
			System.out.println("Enter Num-2");
			float num2 = sc.nextInt();
			
			switch(choice) {
				case 1:
					float add = c.addition(num1, num2);
					System.out.println(add);
					break;
				case 2:
					float sub = c.subtraction(num1, num2);
					System.out.println(sub);
					break;
				case 3:
					float mul = c.multiplication(num1, num2);
					System.out.println(mul);
					break;
				case 4:
					float divide = c.division(num1, num2);
					System.out.println(divide);
					break;
				case 5:
					break;
				default:
					System.out.println("You Enter Wrong Choice:) Try Again!");
					
			}
					
		}
	}

}
