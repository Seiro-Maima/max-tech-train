/* BMDB (Bootcamp Movie Database)
 * This application will allow users to enter movie info
 * This application is redone to use Class
 */

package ui;

import business.Actor;
import business.Console;
import business.Movie;

public class BmdbProjectApp_Arrays {

	// create a static array outside the main method
	private static Actor[] actors = new Actor[100];

	public static void main(String[] args) {

		int command = 0;
		
		// create new instances of Actors
		actors[0] = new Actor(1, "Clark", "Gable", "M", "1901-02-01");
		actors[1] = new Actor(2, "Chadwick", "Boseman", "M", "1976-11-29");
		actors[2] = new Actor(3, "Mark", "Hamill", "M", "1951-09-25");
		
		// welcome message
		System.out.println("Welcome to the Bootcamp Movie DB!");		

		while (command != 9) {
				
			// display menu
			System.out.println("\nMenu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - List Actors");
			System.out.println("3 - Find Actor");
			System.out.println("4 - Add Movie");
			System.out.println("9 - Exit");
	
			// prompt command input from user
			command = Console.getInt("\nCommand: ");
			System.out.println();			
			
			switch(command) {
	
				case 1: 	// add an actor
					
					System.out.println("Add an Actor:");
					
					int id = Console.getInt("ID? ");
					String firstName = Console.getString("First Name? ");
					String lastName = Console.getString("Last Name? ");
					String gender = Console.getString("Gender (M/F)? ");
					String birthDate = Console.getString("BirthDate (YYYY-MM-DD)? ");
		
					// create instance of Actor Class
					Actor actor = new Actor(id, firstName, lastName, gender, birthDate);
					
					// add newly created actor to list of actors
					for(int i=0; i<actors.length;i++) {
						// check if there is a null
						if(actors[i] == null) {
							// add recently created actor into the actor list
							actors[i] = actor;
							break;	// make sure to break here, or it will continue adding to array until size length
						}
					}
					
					System.out.println("\nActor Summary:");
					System.out.println(actor.actorSummary());

					break;
					
				case 2:		// list all actors
										
					System.out.println("List of all Actors: ");
					
					for(Actor a: actors) {
						if(a!=null) {
							System.out.println(a.actorSummary());
						}
					}
					System.out.println();
					
					break;
					
				case 3:		// find actor
					
					System.out.println("Search for an Actor: ");
					id = Console.getInt("ID? ");
					
					for(Actor a:actors) {
						if(a!=null && a.getId()==id) {
							System.out.println("Actor Found!");
							System.out.println(a.actorSummary());
							System.out.println();
						}
					}
					
					break;
					
				case 4: 	// add a movie
					
					System.out.println("Add a Movie:");
					String title = Console.getLine("Title? ");
					String year = Console.getString("Year? ");
					String rating = Console.getString("Rating? ");
					String genre = Console.getString("Genre? ");

					// create an instance of movie Class
					Movie movie = new Movie(title, year, rating, genre);
					System.out.println(movie.movieSummary());
	
					break;
					
				case 9:	// do nothing - break out from loop
					
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
