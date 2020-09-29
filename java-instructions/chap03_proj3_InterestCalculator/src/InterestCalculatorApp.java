import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

/* Chap 3 - Project 3
 * Application calculates the amount of interest for a loan amount
 */

public class InterestCalculatorApp {

	public static void main(String[] args) {
		
		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		String choice = "y";
				
		// welcome message
		System.out.println("Welcome to the Interest Calculator");
		
		while(choice.equalsIgnoreCase("y")) {	
		
			double loanAmt = 0;
			double interestRate = 0;

			// get currency and percentage number formats
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percentage = NumberFormat.getPercentInstance();
			percentage.setMaximumFractionDigits(3); // allow number of decimals after zero for percentage
			
			// prompt user for input
			System.out.print("Enter loan amount: ");
			loanAmt = sc.nextDouble();
			BigDecimal loanAmtBD = new BigDecimal(loanAmt).setScale(2, RoundingMode.HALF_UP);

			System.out.print("Enter inerest rate: ");
			interestRate = sc.nextDouble();
			BigDecimal interestRateBD = new BigDecimal(interestRate);
			
			// calculate cost of interest
			BigDecimal interestBD = new BigDecimal(interestRate).multiply(loanAmtBD);
			
			// output results to user
			System.out.println("\nLoan amount: " + currency.format(loanAmtBD));
			System.out.println("Interest rate: " + percentage.format(interestRateBD));
			System.out.println("Interest: " + currency.format(interestBD));	
			
			// prompt user to enter choice
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			System.out.print("\n");

		}	
		
		// close scanner to avoid memory leak
		sc.close();
		
	}

}
