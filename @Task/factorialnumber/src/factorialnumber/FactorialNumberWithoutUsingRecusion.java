package factorialnumber;

import java.util.Scanner;


public class FactorialNumberWithoutUsingRecusion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any Number : ");
		int num = sc.nextInt();
			
		int fact = 1;
		if(num < 0) {
			System.out.print("Factorial is not defined for negative numbers.");
		}else {
			for(int i = num; i >= 1; i--) {
//				System.out.print(i+" ");
				fact *=i;
//				System.out.print(fact + " ");
			}
			System.out.print("The Factorial Of " + num + " is : " + fact);
		}
	}

}
