
public class TernaryOperatorApp {

	public static void main(String[] args) {
	
		String gender = "F";
		String genderDisplay = "";
		
		// non-ternary way
		if(gender.equalsIgnoreCase("M")) {
			genderDisplay = "Male";
		}else {
			genderDisplay = "Female";
		}
		
		System.out.println("The actor's gender is " + genderDisplay);
		
		// using ternary way - short cut for an if else statement
		System.out.println("----- Ternary Operator ----- ");
		genderDisplay = "";
		
		// question ? trueValue : falseValue
		genderDisplay = gender.equalsIgnoreCase("M") ? "Male" : "Female";
		
		System.out.println("The actor's gender is " + genderDisplay);
		
	}
}
