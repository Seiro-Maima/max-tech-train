/* Chap 4 - BMDB (Bootcamp Movie Database)
 * This application will allow users to enter movie info
 * This application is redone to use switch statements
 */

import java.util.Scanner;

public class BmdbProjectApp_SwitchStatements {

	public static void main(String[] args) {

		// declare and initiate variables
		Scanner sc = new Scanner(System.in);		
		int command = 0;
		String firstName = "";
		String lastName = "";
		String gender = "";
		String birthDate = "";
		String title = "";
		String year = "";
		String rating = "";
		String genre = "";
		
		// welcome message
		System.out.println("Welcome to the Bootcamp Movie DB!");		

		while (command != 3) {
				
			// display menu
			System.out.println("\nMenu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
	
			// prompt command input from user
			System.out.print("\nCommand: ");
			command = sc.nextInt();
			
			switch(command) {
	
				case 1: 	// add an actor
					
					System.out.println("\nAdd an Actor:");
					
					System.out.print("First Name? ");
					firstName = sc.next();
		
					System.out.print("Last Name? ");
					lastName = sc.next();
					
					System.out.print("Gender (M/F)? ");
					gender = sc.next();
					if(gender.equalsIgnoreCase("m"))
						gender = "Male";
					else if(gender.equalsIgnoreCase("f"))
						gender = "Female";
					
					System.out.print("BirthDate (YYYY-MM-DD)? ");
					birthDate = sc.next();
					
					System.out.println("\nActor Summary:");
					System.out.println(firstName + " " + lastName + ", " + gender + ", born " + birthDate);
					
					break;
					
				case 2: 	// add a movie
					
					System.out.println("\nAdd a Movie:");
					
					System.out.print("Title? ");
					sc.nextLine();
					title = sc.nextLine();
									
					System.out.print("Year? ");
					year = sc.next();
					
					System.out.print("Rating? ");
					rating = sc.next();
					
					System.out.print("Genre? ");
					sc.nextLine();
					genre = sc.nextLine();
	
					System.out.println("\nMovie Summary:");
					System.out.println(title + " (" + rating + ") was released in " + year + ". Genre(s): " + genre);
					
					break;
					
				case 3:	// do nothing - break out from loop
					
					break;
				
				default:
					
					System.out.print("\nInvalid Command!\n");
					break;
					
			}

		}
		
		// farewell Message
		System.out.println("\nBye!");
		
		// address resource leak
		sc.close();		
		
	}

}
