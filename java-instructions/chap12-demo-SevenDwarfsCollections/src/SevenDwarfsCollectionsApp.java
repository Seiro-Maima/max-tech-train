import java.util.ArrayList;

public class SevenDwarfsCollectionsApp {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		ArrayList<String> dwarves = new ArrayList<>();
		
		// add method - added by order it was added
		dwarves.add("Doc");
		dwarves.add("Sleepy");
		dwarves.add("Grumpy");
		dwarves.add("Dopey");
		// dwarves.add("0, Dopey"); -> adding an index will force placement in the array
		dwarves.add("Happy");
		dwarves.add("Bashful");
		dwarves.add("Sneezy");
		
		System.out.println("7 Dwarves: " + dwarves);
		
		// get method
		System.out.println("Dwarf at index position 3: " + dwarves.get(3));
		
		// size method
		System.out.println("# of dwarves: " + dwarves.size());
		
		// check if object is in list
		System.out.println("Contains 'Happy'? " + dwarves.contains("Happy"));
		
		// find index of object
		System.out.println("Index of 'Dopey': " + dwarves.indexOf("Dopey"));
		
		// remove method
		System.out.println(dwarves.remove(3));
		System.out.println(dwarves);
		
		// set method
		dwarves.set(3, "Fake Dwarf");
		System.out.println(dwarves);
		
		System.out.println("Bye");
		
	}

}
