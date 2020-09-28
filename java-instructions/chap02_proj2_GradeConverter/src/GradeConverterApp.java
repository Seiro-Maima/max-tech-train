/* Chap 2 - Project 2
 * This application converts number grades to letter grades 
 */

import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {

		// declare and initialize variables 
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		String letterGrade = "";
		
		// welcome message
		System.out.println("Welcome to the Letter Grade Converter!");

		// while loop
		while(choice.equalsIgnoreCase("y")){

			// get user input
			System.out.print("Enter numerical grade: ");
			int numericGrade = sc.nextInt();
	
			if(numericGrade >=88 ){
			    letterGrade = "A";
			}else if(numericGrade >=80 ){
			    letterGrade = "B";		    
			}else if(numericGrade >=67 ){
			    letterGrade = "C";
			}else if(numericGrade >=60 ){
			    letterGrade = "D";
			}else {
			    letterGrade = "F";
			}

			// display output
			System.out.println("Letter Grade: " + letterGrade + "\n");
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}

		// output message
		System.out.println("See Ya!");

		// address resource leak
		sc.close();	
		
	}

}
