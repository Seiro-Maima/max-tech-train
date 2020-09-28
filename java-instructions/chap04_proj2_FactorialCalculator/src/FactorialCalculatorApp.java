/* Chap 4 - Project 2
 * Application calculates factorial of number entered by user
 */

import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {

		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		String choice = "y";
		
		// welcome message
		System.out.println("Welcome to the Factorial Calculator\n");		

		while(choice.equalsIgnoreCase("y")) {
		
			long factorResult = 1; // must be inside while loop to reset value
			
			// prompt input from user
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			userInput = sc.nextInt();

			// calculate formula
			for (int i = 1; i <= userInput; i++) {
				factorResult = i * factorResult;
			}
			
			// output results
			System.out.println("The factorial of " + userInput + " is " + factorResult);
			
			// prompt user to enter choice
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			System.out.print("\n");
			
		}

		// farewell Message
		System.out.println("Okay - See ya!");
		
		// address resource leak
		sc.close();		
		
	}

}
