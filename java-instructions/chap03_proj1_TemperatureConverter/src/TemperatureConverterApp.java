/* Chap 3 - Project 1
 * This application converts temperature values from Fahrenheit to Celsius 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {

		// welcome message
		System.out.println("Welcome to the Temperature Converter\n");
		
		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##"); // Format decimal to 2 places
		String choice = "y";
		double f, c;	
			
		while(choice.equalsIgnoreCase("y")) {
		
			// prompt input from user
			System.out.print("Enter degrees in Fahrenheit: ");
			f = sc.nextDouble();		
			
			// convert F to C
			c = (f-32) * 5/9;
			
			// display output of calculation
			System.out.println("Degrees in Celsius: " + df.format(c) + "\n");
			
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
