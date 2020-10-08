
public class PersonManagerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Person Manager App");
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			String type = Console.getChoiceString("Create Customer or Employee? (c/e): ", "c", "e");
			System.out.println();
			
			String firstName = Console.getString("First Name: ");
			String lastName = Console.getString("Last Name: ");
			
			Person p = null;
			
			if(type.equalsIgnoreCase("c")){
				String custNumber = Console.getString("Customer Number: ");
				Customer c = new Customer(firstName, lastName, custNumber);
				p = c;
			}else if(type.equalsIgnoreCase("e")) {
				String ssn = Console.getString("SSN: ");
				Employee e = new Employee(firstName, lastName, ssn);
				p = e;
			}
						
			Class c = p.getClass();
			System.out.println("\nYou entered a new " + c.getName() + ":");
			System.out.println(p.toString());
			
			choice = Console.getChoiceString("Continue? ", "y", "n");
				
		}
		
		System.out.println("Byeee!");
	}

}
