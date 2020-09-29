/* Chap 4 - Project 3
 * Application three options for tip to leave at restaurant
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.text.NumberFormat;

public class TipCalculatorApp {

	public static void main(String[] args) {

		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		// welcome message
		System.out.println("Tip Calculator\n");		

		while(choice.equalsIgnoreCase("y")) {
			
			// these must be in loop to reset settings when user loops
			double userInput = 0;
			BigDecimal tip15 = new BigDecimal(0.15);
			BigDecimal tip20 = new BigDecimal(0.20);
			BigDecimal tip25 = new BigDecimal(0.25);
			
			// prompt input from user
			System.out.print("Cost of meal: ");
			userInput = sc.nextDouble();
			
			// calculate tip percentage
			BigDecimal mealCost = new BigDecimal(userInput);
			mealCost = mealCost.setScale(2,RoundingMode.HALF_UP);
			
			tip15 = mealCost.multiply(tip15);
			tip15 = tip15.setScale(2,RoundingMode.HALF_UP);		// round up and scale 2 to get correct format	
			
			tip20 = mealCost.multiply(tip20);
			tip20 = tip20.setScale(2,RoundingMode.HALF_UP);		
			
			tip25 = mealCost.multiply(tip25);
			tip25 = tip25.setScale(2,RoundingMode.HALF_UP);		

			// create currency format to show $ when displaying amounts
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			
			// calculate 15% tip
			System.out.println("\n15%");
			System.out.println("Tip amount: " + currency.format(tip15));
			System.out.println("Total amount: " + currency.format(tip15.add(mealCost)) + "\n");

			// calculate 20% tip
			System.out.println("20%");
			System.out.println("Tip amount: " + currency.format(tip20));
			System.out.println("Total amount: " + currency.format(tip20.add(mealCost)) + "\n");

			// calculate 25% tip
			System.out.println("25%");
			System.out.println("Tip amount: " + currency.format(tip25));
			System.out.println("Total amount: " + currency.format(tip25.add(mealCost)) + "\n");

			// prompt user to enter choice
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.print("\n");
				
		}
		
		// farewell Message
		System.out.println("Okay - See ya!");
		
		// address resource leak
		sc.close();		
		
	}

}
