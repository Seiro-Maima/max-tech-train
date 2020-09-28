/* Chap 2 - Project 1
 * This application allows a student to enter registration information. 
 * Display a completion message including student's first name, and
 * a temporary password.
 * */

// import Scanner class to use in this program
import java.util.Scanner;

public class StudentRegistrationApp {
	
	public static void main(String[] args) {

		// get a Scanner object to scan for user input
		Scanner sc = new Scanner(System.in);
		
		// create and initialize variables
		String firstName = "";
		String lastName = "";
		int birthYear= 0;
				
		System.out.println("Student Registration Form");
				
		// get input from user
		System.out.print("Enter first name: ");
		firstName = sc.next();
		System.out.print("Enter last name: ");
		lastName = sc.next();
		System.out.print("Enter year of birth: ");
		birthYear = sc.nextInt();
		
		// output message to user		
		System.out.println("\nWelcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration number is complete.");
		System.out.println("Your temporary password is: " + firstName + "*" + birthYear);
		
	}

}
