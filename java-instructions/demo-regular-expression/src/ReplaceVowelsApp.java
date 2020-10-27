import java.util.Scanner;

public class ReplaceVowelsApp {

		//prompt user for a string, replace all vowels with '*',
		//and return the string
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String:");
			String str = sc.nextLine();

			char[] c = str.toCharArray();
			
			for (int i = 0; i < str.length(); i++) {
				if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
					str = str.replace(c[i], '*');
				}
			}
			
			System.out.println(str);
			
			System.out.println("Try again using regular expressions...");
			System.out.println("Enter another string: ");
			str = sc.nextLine();
			str = str.replaceAll("[aeiouAEIOU]", "*");
			System.out.println(str);
			
			sc.close();
			
		}
}
