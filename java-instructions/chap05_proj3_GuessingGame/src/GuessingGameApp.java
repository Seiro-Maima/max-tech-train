/* Chap 5 - Project 3 
 * Application allows user to guess a number between 1 and 100
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		
		// declare and initialize variables 
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		while(choice.equalsIgnoreCase("y")) {
			
			int compGuess = (int) (Math.random()*100) +1;
			int numGuess = 0; // must be initialized here so it can reset
			int userGuess = 0;
			
			System.out.println("\nI'm thinking of a number from 1 to 100.");
			System.out.println("Try to guess it.\n");
			
			// System.out.println("Number: " + compGuess);	// show random number - for testing
			
			// call method to validate date entered by user
			userGuess = getIntWithinRange(sc, "Enter a number: ", 1, 100);
			
			// call method to check user's guess
			numGuess = checkUserGuess(userGuess, compGuess, sc);
			
			// output results to user
			System.out.println("You got it in " + numGuess + " tries.");			

			if(numGuess <= 3) {
				System.out.println("Great work! You are a mathematical wizard.");
			}else if(numGuess > 3 && numGuess <=7) {
				System.out.println("Not too bad! You've gone some potential.");
			}else if(numGuess > 7){
				System.out.println("What took you so long? Maybe you should take some lessons.");
			}
			
			// prompt user to enter choice to repeat
			sc.nextLine();	// eat anything that may be in buffer
			choice = getRequiredString("\nTry again? (y/n): ", sc);
			
		}

		System.out.println("\nBye - Come back soon!");
	}			

	//--------------------------------------------------------------------------
	// method to validate user input is either (y, Y, N, n) and not blank
	private static String getRequiredString(String prompt, Scanner sc) {
		String str = "";
		boolean isValid = false;
		
		while(!isValid) {
			
			System.out.print(prompt);	// prompt user
			str = sc.nextLine();	// save user input to string
			
			if (str.equals("")) {	// checks to see if string is empty
				System.out.println("Invalid Entry...this field is required.");
			} 
			else if(!str.equalsIgnoreCase("y") && !str.equalsIgnoreCase("n")) {
				System.out.println("Error! Entry must be 'y' or 'n'");
			} else {
				isValid = true;
			}
		}
		return str;
	}
	
	//--------------------------------------------------------------------------
	// method to check user's guess
	public static int checkUserGuess(int userGuess, int compGuess, Scanner sc) {
	
		int numGuess = 0;
		
		// loop until user guesses the correct number
		while(userGuess != compGuess) {						
			if((userGuess > compGuess) && ((userGuess - compGuess) > 10)) {
				System.out.println("Way too high! Guess again.\n");
				numGuess++;
			}else if((userGuess < compGuess) && ((compGuess - userGuess) > 10)) {
				System.out.println("Way too low! Guess again.\n");
				numGuess++;
			}else if(userGuess > compGuess) {
				System.out.println("Too high! Guess again.\n");
				numGuess++;
			}else if(userGuess < compGuess) {
				System.out.println("Too low! Guess again.\n");
				numGuess++;
			}	
			userGuess = getIntWithinRange(sc, "Enter a number: ", 1, 100);
		}

		System.out.println("\nBINGO!\n");
		numGuess++;
		
		return numGuess;
	}
	
	//--------------------------------------------------------------------------
	// method to validate input data from user
	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		
		int userGuess = 0;
		boolean isValid = false;
				
		while(!isValid) {
			try {
				System.out.print(prompt);
				userGuess = sc.nextInt();
				
				if(userGuess < min) {
					System.out.println("Error! Number must be >= " + min + ".\n");
				}else if(userGuess > max) {
					System.out.println("Error! Number must be <= " + max + ".\n");
				}else {
					isValid = true;
					break;
				}			
			} catch (InputMismatchException ime){
				System.out.println("Error! Invalid integer value. Try again. \n");
				sc.nextLine();
				continue;
			}
		}
		
		return userGuess;
	}
}
