/* Chap 4 - Project 3
 * Application three options for tip to leave at restaurant
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {

		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int userInput = 0;
		
		// welcome message
		System.out.println("Tip Calculator\n");		

		while(choice.equalsIgnoreCase("y")) {
					
			// prompt input from user
			System.out.print("Cost of meal: ");
			userInput = sc.nextInt();
			BigDecimal tipAmt = new BigDecimal(userInput);
			
			// calculate 15% tip
			System.out.print("15%");
			tipAmt = tipAmt * 0.15;

			System.out.print("\nTip amount: " + (tipAmt*0.15));
			System.out.print("\nTotAmt: ");

			// calculate 20% tip
			System.out.print("20%\n");
			System.out.print("\nTip amount: ");
			System.out.print("\nTotAmt: ");

			// calculate 25% tip
			System.out.print("25%\n");
			System.out.print("\nTip amount: ");
			System.out.print("\nTotAmt: ");
			
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
