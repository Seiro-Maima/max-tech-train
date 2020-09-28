/* Application will provide addition and subtraction functions*/

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App!");
		
		Scanner sc = new Scanner(System.in);
		
		String command = "";
		
		// while command is not equal to x
		while(!command.equalsIgnoreCase("x")) {
			System.out.println("\n\nCOMMAND MENU:");
			System.out.println("=============");
			System.out.println("+ : Addition");			
			System.out.println("- : Subtraction");
			System.out.println("x : Exit App");			
			System.out.println();
			System.out.print("Enter command: ");
			
			command = sc.next();
			int n1 = 0;
			int n2 = 0;
			int result = 0;
			
			switch(command) {
				case "+":
					System.out.print("Addition - ");
					System.out.print("Enter 2 numbers: ");
					n1 = sc.nextInt();
					n2 = sc.nextInt();
					result = n1 + n2;
					System.out.print("Result: " + result);
					break;
				case "-":
					System.out.print("Subtraction - ");
					System.out.print("Enter 2 numbers: ");
					n1 = sc.nextInt();
					n2 = sc.nextInt();
					result = n1 - n2;
					System.out.print("Result: " + result);
					break;
				case "x":
				case "X":
					// exit
					break;
				default:
					System.out.print("Invalid Entry!");
					break;
			}
			
		}
		
		sc.close();
		System.out.println("\nHave a good one!");
		
	}

}
