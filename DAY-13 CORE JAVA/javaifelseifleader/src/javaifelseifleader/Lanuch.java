package javaifelseifleader;
import java.util.*;

public class Lanuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IF-ELSE-IF LEADER
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ENTER YOUR PINCODE: ");
		int pincode = scan.nextInt();
		
		
		if(pincode == 1122) {
			System.out.println("This pincode is used for Mumbai!");
		}else if(pincode == 3456) {
			System.out.println("This pincode is used for Haydrabad!");
		}else if(pincode == 9999){
			System.out.println("This pincode is used for Bhopal!");
		}else {
			System.out.println("Area Not Found!");
		}
		
		
		
		/* LOGICAL OPERATORS
		 
		 * And (&&)
		 * Or (||)
		 * Not (!)
		 		 
		 */
		
		System.out.print("ENTER YOUR OVERALL PERCENTAGE: ");
		byte per = scan.nextByte();
		
		System.out.print("DO YOU HAVE TC? ");
		char tc = scan.next().charAt(0);
		
		System.out.print("ENTER YOUR PCM PERCENTAGE: ");
		byte pcm = scan.nextByte();
		
		// USING AND (&&) OPERATOR
		if(per >= 60 && (tc =='Y') && pcm >= 50 ){
			System.out.println("Yor are Eligible for Admission!");
		}else {
			System.out.println("Yor are not Eligible for Admission!");
		}
		
		// USING OR (||) OPERATOR
		if(per >= 60 || (tc =='Y') || pcm >= 50 ){
			System.out.println("Yor are Eligible for Admission!");
		}else {
			System.out.println("Yor are not Eligible for Admission!");
		}
		
		// USING NOT (!) OPERATOR
		if(per >= 60 != (tc =='Y') != pcm >= 50 ){
			System.out.println("Yor are not Eligible for Admission!");
		}else {
			System.out.println("Yor are Eligible for Admission!");
		}
		
		
		
		/*	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			break cannot be used outside of a loop or a switch
		*/
		int a = 10;
		if(a>5) {
//			break;
			System.out.println("Hello");
		}
		System.out.println("Exit");
	}

}
