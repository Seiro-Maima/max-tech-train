/* BMDB (Bootcamp Movie Database)
 * This application will allow users to enter movie info
 * This application is redone to use Class
 */

public class BmdbProjectApp_Class {

	public static void main(String[] args) {

		int command = 0;
		
		// welcome message
		System.out.println("Welcome to the Bootcamp Movie DB!");		

		while (command != 3) {
				
			// display menu
			System.out.println("\nMenu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
	
			// prompt command input from user
			command = Console.getInt("\nCommand: ");
			System.out.println();
			
			switch(command) {
	
				case 1: 	// add an actor
					
					System.out.println("Add an Actor:");
					
					String firstName = Console.getString("First Name? ");
					String lastName = Console.getString("Last Name? ");
					String gender = Console.getString("Gender (M/F)? ");
					String birthDate = Console.getString("BirthDate (YYYY-MM-DD)? ");
		
					// create instance of Actor Class
					System.out.println("\nActor Summary:");
					Actor actor = new Actor(firstName, lastName, gender, birthDate);
					System.out.println(actor.actorSummary());

					break;
					
				case 2: 	// add a movie
					
					System.out.println("Add a Movie:");
					String title = Console.getLine("Title? ");
					String year = Console.getString("Year? ");
					String rating = Console.getString("Rating? ");
					String genre = Console.getString("Genre? ");

					// create an instance of movie Class
					Movie movie = new Movie(title, year, rating, genre);
					System.out.println(movie.movieSummary());
	
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
		
	}

}
