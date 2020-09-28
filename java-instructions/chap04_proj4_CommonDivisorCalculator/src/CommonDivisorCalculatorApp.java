/* Chap 4 - Project 4
 * This application find the greatest common divisor of 2 positive integers
 */

import java.util.Scanner;
public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {

		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		int numOne = 0;
		int numTwo = 0;
		String choice = "y";
		
		// welcome message
		System.out.println("Greatest Common Divisor Finder\n");		

		while(choice.equalsIgnoreCase("y")) {
		
			int temp = 0;
						
			// prompt input from user
			System.out.print("Enter first number: ");
			numOne = sc.nextInt();
			System.out.print("Enter second number: ");
			numTwo = sc.nextInt();
			
			// calculate formula
			while(numOne != 0) {		
				// subtract x from y repeatedly until y < x
				while(numTwo >= numOne) {
					numTwo = numTwo - numOne;
				}
				
				// swap the value of x and y
				temp = numOne;
				numOne = numTwo;
				numTwo = temp;
			}
						
			// output results
			System.out.println("Greatest common divisor is: " + numTwo);
						
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
