/* Chap 4 - Project 1
 * Application displays a table of squares
 * Values start at 1 until the value the user entered
 */

import java.util.Scanner;

public class TableofPowersApp {

	public static void main(String[] args) {

		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		String choice = "y";
		int square = 0;
		int cube = 0;
		
		
		// welcome message
		System.out.println("Welcome to the Squares and Cubes table\n");		
					
		while(choice.equalsIgnoreCase("y")) {
		
			// prompt input from user
			System.out.print("Enter an integer: ");
			userInput = sc.nextInt();
			
			System.out.println("\nNumber\t Squared\t Cubed\t");
			System.out.println("======\t =======\t =====\t");
			
			
			for (int i = 1; i <= userInput; i++) {
			
				// calculate formula
				square = i * i;
				cube = i * i * i;
				
				// output results
				System.out.println(i + " \t " + square + " \t\t " + cube);
				
			}
			
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
