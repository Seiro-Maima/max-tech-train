package ui;

import ui.console.Console;	// importing the console library

public class ConsoleLibraryDemoApp {

	public static void main(String[] args) {

		System.out.println("Hello");
	
		// calling methods from the Console class
		String str = Console.getLine("Enter a sentence: ");
		int n = Console.getInt("Enter a number between 1 and 10: ", 1, 10);
		
		System.out.println("\nYou've entered the following: ");
		System.out.println(str);
		System.out.println(n);
		
		System.out.println("Bye!");
	}

}
