/* Chap 5 - Project 2
 * Application will add data validation
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataValidationApp {

	public static void main(String[] args) {
		
		// declare and initialize variables 
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		// welcome message
		System.out.println("Welcome to the Area and Perimeter Calculator!\n");

		// while loop
		while(choice.equalsIgnoreCase("y")){

			// get user input
			double length = getDoubleWithinRange("Enter length: ", sc, 1, 1000000);
			double width = getDoubleWithinRange("Enter width: ", sc, 1, 1000000);
			
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
		
		sc.close();
		
	}
	
	private static double getDoubleWithinRange(String prompt, Scanner sc, int min, int max) {
		
		double number = 0;
		boolean isValid = false;
				
		while(!isValid) {

			try {
				System.out.println(prompt);
				number = sc.nextDouble();
				
				if(number < min) {
					System.out.println("Error! Number must be >= " + min + ".\n");
				}else if(number > max) {
					System.out.println("Error! Number must be <= " + max + ".\n");
				}else {
					isValid = true;
					break;
				}
								
			} catch (InputMismatchException ime){
				System.out.println("Error! Invalid decimal value. Try again. \n");
				sc.nextLine();
				continue;
			}
		}
		
		return number;
	}
	
}
