package ui;

import java.util.Scanner;

public class ExceptionHandlingApp {

	public static void main(String[] args) {

		System.out.println("Hello");

		Scanner sc = new Scanner(System.in);

		int number = 0;
		while(number!=99) {
			System.out.print("Enter a number: ");
			try {
				number = sc.nextInt();
				
			} catch (Exception e) {

				e.printStackTrace();	// call method to print stack trace
				sc.nextLine();			// get rid of items in buffer, otherwise it will repeat
			}
			System.out.println("You entered: " + number);
			System.out.println();
			// enter decimal value will result in InputMismatchException
			// runtime exceptions happen during the application running
			// stack trace - trace back the chain of command in method called to find the problem ***
		}
		
		sc.close();
		
		System.out.println("Bye");
	}

}
