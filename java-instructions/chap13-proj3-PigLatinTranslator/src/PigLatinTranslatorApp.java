import java.util.ArrayList;
import java.util.List;

import ui.console.Console;

public class PigLatinTranslatorApp {

	public static void main(String[] args) {

		System.out.println("Pig Latin Translator");
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			String userString = Console.getLine("Enter a line: ");
			
			// split sentence into word array
			String[] words = userString.split(" ");

			//String[] translation = new String[words.length];
			
			for(String word: words) {
				//change to lower case
				word = word.toLowerCase();
				// call method to remove any 
				removePunctuation(word);
				
				if(!(isAllLetter(word))) {
					translate(word);
					continue;
				}
				
			}
			
			

			
			// -------------------------------------------

			
			
			choice = Console.getChoiceString("Another line? (y/n) ", "y", "n");
		}
		
		System.out.println("Bye");
	}
	
	
	private static String translate (String str) {
		
		String[] vowels = {"a", "e", "i", "o", "u"};
		
		for(String s: vowels) {
			if(str.startsWith(s)) {
				str += "way";
				return str;
			}
		}
		
		if(str.startsWith("y")) {
			str = str.substring(1)+"y";
			return str;
		}	
		
		char chars[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			char c = chars[i];
			
			for(int j=0; j<vowels.length; j++) {
				if(c==vowels[j])
				
			}
				
				
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// method that will check if there are any special characters in the word
	private static boolean isAllLetter(String str) {
		
		boolean allLetters = true;
		
		// make array of characters into single characters
		char[] chars = str.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			char c = chars[i];
			//if any character is not a letter
			if(!Character.isLetter(c) && (!(i == (chars.length-1)))) {
				allLetters = false;
				break;
			}
		}
		
		
		return allLetters;
	}
	
	// method remove ending special characters
	private static void removePunctuation(String str) {
		// get character at the last postion of the string
		char c = str.charAt(str.length()-1);
		
		if(c=='.' || c=='!' || c=='?') {
			// take the sympbol away
			str = str.substring(0,str.length()-1);
			
		}
		
	}
	
	
	
	
	
}
