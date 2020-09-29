/* Chap 3 - Project 4 
 * Application calculates minimum number of quarters, dimes, nickels, and pennies are needed
 * */

import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {

		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		String choice = "y";
		
		// welcome message
		System.out.println("Welcome to the Change Calculator\n");		

		while(choice.equalsIgnoreCase("y")) {
		
			// prompt input from user
			System.out.print("Enter number of cents (0-99): ");
			userInput = sc.nextInt();
		
			// declare and initialize variables
			int numQuarters = 0;
			int numDimes = 0;
			int numNickels = 0;
			int numPennies = 0;

			// calculate equation
			numQuarters = userInput/25; 
			userInput = userInput%25; // after taking out quarters, put leftovers back into userInput
			
			numDimes = userInput/10;
			userInput = userInput%10; // after taking out dimes, put leftovers back into userInput
			
			numNickels = userInput/5;
			userInput = userInput%5; // after taking out nickels, put leftovers back into userInput
			
			numPennies = userInput;  // leftovers are now just pennies			
			
			// output results
			System.out.println("\nQuarters: " + numQuarters);
			System.out.println("Dimes: " + numDimes);
			System.out.println("Nickels: " + numNickels);
			System.out.println("Pennies: " + numPennies);

			// prompt user to enter choice
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			System.out.print("\n");
			
		}
		
		// address resource leak
		sc.close();		
		
	}

}
