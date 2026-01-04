package javacontrolstatement;
//import java.util.Scanner;

public class Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* 	Nested if-else statement 	*/
		
		java.util.Scanner	scan =	new java.util.Scanner(System.in);
		
		System.out.print("ENETR YOUR PERCENTAGE: ");
		byte per = scan.nextByte();
		
		System.out.print("ENTER YOUR TC CERTIFICATE: ");
		char tc = scan.next().charAt(0);
		
		System.out.print("ENTER YOUR PCM PERCENTAGE: ");
		byte pcm = scan.nextByte();
		
		
		if(per >=60) {
			if(tc == 'Y' || tc== 'y') {
				if(pcm >=50) {
					System.out.println("You are eligible for admission!");
				}else {
					System.out.println("Your PCM percentage is low: Yor are not Eligilbe for admission!");
				}
			}else {
				System.out.println("Your TC Certificate is not valid: You Are Not Eligible for admission!");
			}
		}else {
			System.out.println("Your Overall percentage is low: You Are Not Eligible for admission!");
		}
	}

}
