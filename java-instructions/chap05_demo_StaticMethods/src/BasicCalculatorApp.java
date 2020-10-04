import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculatorApp {

	// main method
	public static void main(String[] args) {

		printWelcomeMessage();
		
		Scanner sc = new Scanner(System.in);
		int number = getInt("How many times to print?", sc);
		printHello(number);
		
		int a = getInt("Enter a whole number: ", sc);
		int b = getInt("Enter another whole number: ", sc);
		System.out.println("Sum of " + a + " + " + b + " = " + sum(a,b));	

		double c = getDouble("Enter a decimal number: ", sc);
		double d = getDouble("Enter another decimal number: ", sc);
		System.out.println("Sum of " + c + " + " + d + " = " + sum(c,d));	

		// use getIntWithinRange to validate a month entry (1-12)
		int month = getIntWithinRange("Enter a month number: ", sc, 1, 12);
		System.out.println("Month entered: " + month);
		
		sc.close();
		
	}
	
	// method for getting int value using Exception Handling
	private static int getInt(String prompt, Scanner sc) {
		
		int nbr = 0;
		
		while(true) {	// while(true) is not good practice
			try {
				System.out.println(prompt);
				nbr = sc.nextInt();
				break;
			} catch (InputMismatchException ime){
				System.out.println("Error! Invalid integer. Try again. \n");
				sc.nextLine();
				continue;
			}
		}
		return nbr;
	}
	
	private static int getIntWithinRange(String prompt, Scanner sc, int min, int max) {
	
		int nbr = 0;
		boolean isValid = false;
		
		while(!isValid) {
			nbr = getInt(prompt, sc);
			if(nbr < min) {
				System.out.println("Error! Number must be >= " + min + ".");
			}else if(nbr > max) {
				System.out.println("Error! Number must be <= " + max + ".");
			}else {
				isValid = true;
			}
		}
		
		return nbr;
	}
	
	// method for getting double value using data validation 
	private static double getDouble(String prompt, Scanner sc) {
		
		double number = 0;
		
		while(true) {	// while(true) is not good practice
	
				System.out.println(prompt);
				if(sc.hasNextDouble()) {
					number = sc.nextDouble();
					break;
				}else {
					System.out.println("Error! Invalid double. Try again. \n");
					sc.nextLine(); // clear out any remaining invalid entry
					continue;
				}
		}
		return number;
	}

	
	// welcome method - static method with no input or return type
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the Basic Calculator App!");
	}
	
	// method with input int and no return type
	private static void printHello(int n) {		
		// print "hello" n number of times
		for( int i = 1; i <= n; i++) {
			System.out.println(i + " Hello");
		}
	}

	// method that returns a sum of 2 ints
	private static int sum(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
	
	// method that returns a sum of 2 doubles
	private static double sum(double a, double b) {
		return a+b;
	}
		
}
