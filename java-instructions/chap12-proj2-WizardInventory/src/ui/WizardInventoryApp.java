package ui;

import java.util.ArrayList;
import java.util.List;

import ui.console.Console;
public class WizardInventoryApp {

	private static List<String> items = new ArrayList<>();
	
	public static void main(String[] args) {
	
		System.out.println("Welcome to the Wizard Inventory App!");

		// call method that initializes items
		initializeItems();
		
		String command = "";
		
		while(!command.equalsIgnoreCase("exit")) {
			
			// call method to display the menu
			displayMenu();
			command = Console.getString("Command: ");

			switch(command) {
				case "show":	// list all items
					
					for(int i=0; i<items.size();i++) {
						System.out.println(i+1+". " + items.get(i));
					}
					System.out.println();
					
					break;
					
				case "grab":	// grab (add) an item
					
					if(items.size() >= 4) {
						System.out.println("You can't carry anymore items. Please drop one first.");
					}else {
						String name = Console.getLine("Name: ");
						items.add(name);
						System.out.println(name + " was added.");
					}
					
					break;
				
				case "edit":
				
					// edit - prompt for item # (not the index!)
					String item = findItem();
					int idx = items.indexOf(item);
					String newName = Console.getLine("Updated name: ");	
					System.out.println("Item #" + idx+1 + " was updated.");
					
					
					items.set(idx, newName);

					break;
				case "drop":
					
					int itemNum = Console.getInt("Number: ", 1, items.size());
					String itemRemoved = items.remove(itemNum-1);
					
					System.out.println(itemRemoved + " was removed.");
					
					break;
					
				case "exit":
					
					break;
			}
			
		}	
		
		System.out.println("Bye!");
	}

	// method that will provide initial items
	private static void initializeItems() {
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");
	}

	// method to display the menu
	private static void displayMenu() {
		
		String menu = "\nCOMMAND MENU:\n" +
					"show - Show all items\n" +
					"grab - Grab (add) an item\n" +
					"edit - Edit an item\n" +
					"drop - Drop an item\n" +
					"exit - Exit program\n";
			
		System.out.println(menu);
		
	}
	
	// method to find item
	private static String findItem() {
		
		int itemNum = Console.getInt("Number: ", 1, items.size());
		String item = items.get(itemNum-1);
		
		return item;
	}
	
}
