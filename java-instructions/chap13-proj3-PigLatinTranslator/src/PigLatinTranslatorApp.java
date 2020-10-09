import ui.console.Console;

public class PigLatinTranslatorApp {

	public static void main(String[] args) {

		System.out.println("Pig Latin Translator");
		
		String command = "y";
		
		while(command.equalsIgnoreCase("y")) {
			
			String userString = Console.getLine("Enter a line: ");
			StringBuilder splitWords = new StringBuilder();
			
			System.out.println(userString);
			
			String[] words = userString.split(" ");
			for(String word: words) {
				word = word.toLowerCase();
				splitWords.append(word);
				System.out.println(word);					
				}
			
			System.out.println(splitWords);					

			
			
			command = Console.getChoiceString("Another line? (y/n) ", "y", "n");
		}
			
		System.out.println("Bye");
		
	}

}
