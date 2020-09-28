import java.util.Scanner;

/* Chap 4 - In class Demo
 * Examples of if statements
 */
public class IfStatementApp {

	public static void main(String[] args) {
		
		 // reference book page 124
		
		String color = "red";
		
		// if (color == "red") <-- don't do this!!!
		if(color.equalsIgnoreCase("red")) {		
			System.out.println("color is red");
		}
		
		if(color.equalsIgnoreCase("red"))		// this works without curly braces
			System.out.println("color is red");
		System.out.println("hello"); // not part of if statement - will always run

		// ------------------------------------------------------
		
		int total = 50;
		
		if(total == 50) {
			System.out.println("total is 50!");
		}
		else if(total > 50) {
			System.out.println("total is greater than 50!");
		}
		else if(total < 50) {
			System.out.println("total is less than 50!");
		}
		
		// ------------------------------------------------------
		
		if(total >= 75) {
			System.out.println("total is greater than or equal to 75");
		}
		else if(total <= 75) {
			System.out.println("total is less than or equal to 75!");
		}
		else if(total != 0) {
			System.out.println("total is not equal to 0!");		
		}

		// ------------------------------------------------------
		// traffic light example
		
		int distFromLight = 30;	// yards from stop sign
				
		if(color.equalsIgnoreCase("red")) {		
			System.out.println("Light is red... STOP!");
		} else if(color.equalsIgnoreCase("green")) {		
			System.out.println("Light is green... GO!");
		} else if(color.equalsIgnoreCase("yellow") && distFromLight > 30) {		
			System.out.println("Light is yellow and far away... SLOW DOWN!");
		} else if(color.equalsIgnoreCase("yellow") && distFromLight <= 30) {		
			System.out.println("Light is yellow and close...SPEED UP!");
		} else {
			System.out.println("Error - invalid ligh color!");
		}		
					
		// ------------------------------------------------------
		// reference book page 123
		
		int favNum = 10;
		
		if(favNum == 10 || favNum == 11) {		
			System.out.println("Number is 10 or 11");
		}
		else {
			System.out.println("Number is not 10 or 11");
		}
		
		// ------------------------------------------------------
		// reference book page 124
		// add two numbers if favorite number is 10
		// remember to declare and initiate variable outside block of code
		// 	otherwise, those variables can only be used in the code block
		
		int n1 = 0;
		int n2 = 0;
		
		if(favNum == 10) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter 2 numbers on one line: ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}

		int sum = n1 + n2;
		System.out.print("Sum = " + sum);


	}

}
