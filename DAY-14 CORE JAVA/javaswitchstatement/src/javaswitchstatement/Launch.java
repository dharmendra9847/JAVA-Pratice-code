package javaswitchstatement;
import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ENTER A DAY: ");
		byte day = scan.nextByte();
				
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		    default:
		    	System.out.println("Choose correct day!");
		}
		
		
		System.out.print("ENTER YOUR FIRST NUMBER: ");
		int num1 = scan.nextInt();
		
		System.out.print("ENTER YOUR SECOND NUMBER: ");
		int num2 = scan.nextInt();
		
		System.out.print("ENTER YOUR CHOICE: ");
		byte choice = scan.nextByte();
		
		switch(choice){
			case 1:
				int add = num1 + num2;
				System.out.println(add);
				break;
			case 2:
				int sub = num1 - num2;
				System.out.println(sub);
				break;
			case 3:
				int multi = num1 * num2;
				System.out.println(multi);
				break;
			case 4:
				int devide = num1 / num2;
				System.out.println(devide);
				break;
			default:
				System.out.print("YOU HAVE ENTER WRONG CHOICE!");
		}
		
	}

}
