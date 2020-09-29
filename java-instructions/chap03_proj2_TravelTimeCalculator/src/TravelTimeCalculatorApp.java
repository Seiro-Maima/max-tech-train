/* Chap 3 - Project 2
 * Application will calculate travel time based on distance and speed
 */

import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		
		// display welcome message
		System.out.println("Welcome to the Travel Time Calculator\n");	
			
		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {	
			
			double m = 0;
			double mph = 0;
			double hours = 0;
			double mins = 0;;
		
			// prompt user to enter information		
			System.out.print("Enter miles: ");
			m = sc.nextDouble();
			System.out.print("Enter miles per hour: ");
			mph = sc.nextDouble();
			
			// calculate formula
			hours = m / mph;
			mins = hours * 60;
			
			// modulo is leftovers, which is minutes
            int hoursInt = (int) mins / 60;
            int minInt = (int)mins % 60;
			
			// output result of calculations to user
			System.out.println("\nEstimated travel time");
			System.out.println("---------------------");	
			System.out.println("Hours: " + hoursInt);	
			System.out.println("Minutes: " + minInt);	
			
			// prompt user to enter choice
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			System.out.print("\n");

		}	
				
		// display farewell message
		System.out.println("Safe Travels!");	
	}

}
