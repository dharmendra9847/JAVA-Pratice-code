package factorial;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		FactorialNumber fn = new FactorialNumber();
		
		System.out.print("Enter Any Number : ");
		int num = sc.nextInt();
		
//		int res = fn.test(num);
//		System.out.print("The Factorial Of " + num + " is : " + res);
//		
		int fact = 1;
		if(num < 0) {
			System.out.print("Factorial is not defined for negative numbers.");
		}else {
			for(int i = 1; i <= num; i++) {
				fact *=i;
			}
			System.out.print("The Factorial Of " + num + " is : " + fact);
		}
				
	}
}
