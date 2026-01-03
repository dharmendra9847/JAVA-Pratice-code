package factorial;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		FactorialNumber fn = new FactorialNumber();
		
		System.out.print("Enter Any Number : ");
		int num = sc.nextInt();
		
		int res = fn.test(num);
		System.out.print("The Factorial Of " + num + " is : " + res);
		
				
	}
}
