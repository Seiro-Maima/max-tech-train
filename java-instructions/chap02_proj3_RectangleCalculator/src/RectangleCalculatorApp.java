/* Chap 2 - Project 3
 * This application calculates the area and parameter of a rectangle 
 */

import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {

		// declare and initialize variables 
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		
		// welcome message
		System.out.println("Welcome to the Area and Perimeter Calculator!");

		// while loop
		while(choice.equalsIgnoreCase("y")){

			// get user input
			System.out.print("\nEnter length: ");
			int length = sc.nextInt();
			System.out.print("Enter width: ");
			int width = sc.nextInt();			
			
			// calculate formula
			double area = length * width;
			double param = 2 * width + 2 * length;
	
			// display output
			System.out.println("Area: " + area);
			System.out.println("Paramter: " + param);
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		
		// output message
		System.out.println("See Ya!");

	}

}
