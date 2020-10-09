
public class StringsApp {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		// find the spaces in this string
		String name = "Eddie Van Halen";
		System.out.println(name + " is " + name.length() + " characters long.");
		int idx1 = name.indexOf(" ");
		System.out.println("First space is at index: " + idx1);
		int idx2 = name.indexOf(" ", 6); // find the second space, so start after index 5
		System.out.println("Second space is at index: " + idx2);
		
		// trim method
		String name1 = "Bob Marley          ";
		name1 = name1.trim();	// trim method returns a string, so must resave into variable
		System.out.println(name1 + ".");
		
		// substring method - get a piece of string
		String bob = name1.substring(0, 3);	// last index is exclusive
		System.out.println("first name = " + bob);
		
		String fName = name.substring(0, idx1);
		String mName = name.substring(idx1+1, idx2);
		String lName = name.substring(idx2+1);
		System.out.println("First: " + fName + " . Middle: " + mName + ". Last: " + lName);
		
		// replace method
		name1 = name1.replace(" ", "-");
		System.out.println(name1);
		
		// split method
		String sentence = "Is it lunchtime yet?";
		String[] words = sentence.split(" ");
		for(String s: words) {
			System.out.println(s);
		}
		
		// String Builder
		StringBuilder sentence2 = new StringBuilder();
		sentence2.append("Hello, ");
		sentence2.append("how ");
		sentence2.append("are ");
		sentence2.append("you?");
        System.out.println(sentence2);
		
		System.out.println("Capacity = " + sentence2.capacity());
		System.out.println("Length = " + sentence2.length());

		sentence2.insert(7 , "Mimi ");
		System.out.println(sentence2);
		
		System.out.println("Bye!");
		
	}

}
