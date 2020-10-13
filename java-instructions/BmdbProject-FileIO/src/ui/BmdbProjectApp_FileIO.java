/* BMDB (Bootcamp Movie Database)
 * This application will allow users to enter movie info
 * This application is redone to use localDate and File Input/Output
 */

package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import business.Movie;
import db.ActorTextFile;
import db.DAO;
import ui.console.Console;

public class BmdbProjectApp_FileIO {
	
	// CHANGE THIS LATER
	private static List<Movie> movies = new ArrayList<>();
	
	// create a new instance of ActorTextFile
	private static DAO<Actor> actorDAO = new ActorTextFile();
	
	public static void main(String[] args) {

		int command = 0;
		
		// welcome message
		System.out.println("Welcome to the Bootcamp Movie DB!");		
		
		while (command != 9) {
				
			// display menu
			System.out.println("\nMenu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - List Actors");
			System.out.println("3 - Find Actor");
			System.out.println("4 - Add Movie");
			System.out.println("5 - List Movies");
			System.out.println("6 - Find Movie");
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
					LocalDate birthDate = LocalDate.parse(Console.getString("BirthDate (YYYY-MM-DD)? "));
		
					// create instance of Actor Class
					Actor actor = new Actor(id, firstName, lastName, gender, birthDate);
					
					actorDAO.add(actor);
					System.out.println("Actor Added!");
					
					System.out.println("\nActor Summary:");
					System.out.println(actor.actorSummary());

					break;
					
				case 2:		// list all actors
										
					System.out.println("List of all Actors: ");
					
					for(Actor a: actorDAO.getAll()) {
						if(a!=null) {
							System.out.println(a.actorSummary());
						}
					}
					System.out.println();
					
					break;
					
				case 3:		// find actor
					
					System.out.println("Search for an Actor: ");
					System.out.println("*** Not yet implemented ***");
//					int movieID = Console.getInt("ID? ");
					
//					for(Actor a:actors) {
//						if(a!=null && a.getId()==movieID) {
//							System.out.println("Actor Found!");
//							System.out.println(a.actorSummary());
//						}
//					}
					
					break;

				case 4: 	// add a movie
					
					System.out.println("Add a Movie:");
					int movieID = Console.getInt("ID? ");
					String title = Console.getLine("Title? ");
					String year = Console.getString("Year? ");
					String rating = Console.getString("Rating? ");
					String genre = Console.getString("Genre? ");

					// create an instance of movie Class
					Movie movie = new Movie(movieID, title, year, rating, genre);
					movies.add(movie);
					System.out.println("Movie Added!");
					System.out.println(movie.movieSummary());
	
					break;
					
				case 5: 	// list all movies
					
					System.out.println("List of all Movies:");
					
					for(Movie m : movies) {
						if(m!=null) {
							System.out.println(m.movieSummary());
						}
					}
													
					break;
					
				case 6: 	// find a movie	
					
					System.out.println("Find a moive by id: ");
					id = Console.getInt("ID ");
					for (Movie m: movies) {
						if (m!=null && m.getId()==id) {
							System.out.println("Movie found:!");
							System.out.println(m.movieSummary());
						}
					}
					System.out.println();
					
					break;
					
				case 9:	// do nothing - break out from loop
					
					break;
				
				default:
					
					System.out.print("Invalid Command! Try Again.\n");
					break;
			}

		}
		
		// farewell Message
		System.out.println("\nBye!");	
		
	}

}
