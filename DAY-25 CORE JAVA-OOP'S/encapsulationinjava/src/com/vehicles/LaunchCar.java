package com.vehicles;
import java.util.Scanner;


public class LaunchCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("[ ***** DAY-25  | ENCAPSULATION IN JAVA ***** ] \n");
			
			Car car = new Car();
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("ENTER MODEL NAME: ");
			String modelName = scan.nextLine();
			
			System.out.print("ENTER MODEL NUMBER: ");
			int modelNumber = scan.nextInt();
			
			String color = scan.nextLine();
			System.out.print("CAR COLOR: ");
			
			
			String engine = scan.nextLine();
			System.out.print("ENGINE TYPE: ");
			
			
			int milage = scan.nextInt();
			System.out.print("MILAGE: ");
			
			int space = scan.nextInt();
			System.out.print("SPACE: ");
			
			
			System.out.println();
			
			CarInfo carinfo = new CarInfo();
			
			carinfo.setModelName(modelName);
			carinfo.setModelNumber(modelNumber);
			carinfo.setColor(color);
			carinfo.setEngine(engine);
			carinfo.setMilage(milage);
			carinfo.setSpace(space);
			
			car.testCar(carinfo);
			
			System.out.println();
		}
	}

}
