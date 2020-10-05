/* Chap 7 - Project 1
 * Application that uses a class to store and display contact information
 */

public class ContactListApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Contact List App");
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
						
			String firstName = Console.getString("\nEnter first name: ");
			String lastName = Console.getString("Enter last name: ");
			String email = Console.getString("Enter email: ");
			String phone = Console.getString("Enter phone: ");

			//Contact.displayContact(); 	//-> can't call this method unless an instance is created!

			// create an instance of Contact Class
			Contact c = new Contact(firstName, lastName, email, phone);
			
			// call the displayContact() method from the Contact class
			System.out.println(c.displayContact());
			
			choice = Console.getString("\nContinue? (y/n) ");
		
		}
		
		System.out.println("\nOkay - Bye!");
	
	}
	
}
