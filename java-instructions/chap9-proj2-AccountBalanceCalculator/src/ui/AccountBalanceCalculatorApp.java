package ui;

import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import ui.console.Console;

public class AccountBalanceCalculatorApp {

	private static NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args) {

		System.out.println("Welcome to the Account Balance Calculator App!");
		
		// initialize account balances
		CheckingAccount ca = new CheckingAccount(1000.0, 1.0);
		SavingsAccount sa = new SavingsAccount(1000.0, 0.01);
		
		// display balance summary
		System.out.println();
		System.out.println("Starting Balance: ");
		// call method to display balance
		displayBalanceSummary(ca, sa);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println();
			
			// prompt for transaction type
			String transType = Console.getChoiceString("Withdrawel or Deposit (w/d)? ", "w", "d");
			String account = Console.getChoiceString("Checking or Savings (c/s)? ", "c", "s");
			
			// determine max: deposit - infinity, withdrawel, balance
			double max = 0;
			Account a = null;
			
			if(account.equalsIgnoreCase("c")) {
				a = ca;
			}
			else {
				a = sa;
			}
			
			if(transType.equalsIgnoreCase("w")) {
				max = a.getBalance();
			} else {
				max = Double.POSITIVE_INFINITY;
			}
			
			double amount = Console.getDouble("Amount? ", 1, max);
			
			// execute transaction
			if(transType.equalsIgnoreCase("w")) {
				a.withdraw(amount);
			}else {
				a.depoosit(amount);
			}
			choice = Console.getChoiceString("Continue? (y/n)", "y", "n");
		}
		
		// display Monthly Payments and Fees
		sa.applyInterestPaymentToBalance();
		ca.subtractFeeFromBalance();
		System.out.println("Monthly Payment and Fees: ");
		System.out.println("Checking Fee: " + currency.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment: " + currency.format(sa.getMonthlyInterestPayment()));
		System.out.println();
		
		// display Balance Summary
		System.out.println("Final Balances:");
		displayBalanceSummary(ca, sa);
		
		System.out.println("\nBye");
	}

	// method to display summary of both accounts
	private static void displayBalanceSummary(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: " + currency.format(ca.getBalance()));
		System.out.println("Savings: " + currency.format(sa.getBalance()));
	}

}
