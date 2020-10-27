
public class CalculatorApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the calculator!");
		System.out.println(sum(2,4));
		System.out.println(sum(2,4,6));
		System.out.println(sum(2,4,6,8));
		System.out.println(sum(2,4,6,8,10));
		System.out.println(sum(5,8,2,5,6,7,8,9,12,15,17,19));
		
		System.out.println("Bye");
		
	}
	
	// method that returns sum of 2 integers
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// method that returns sum of 3 integers
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	// method that returns sume of 3 integers
	private static int sum(int a, int b, int c, int d) {
		return a + b + c;
	}
	
	// method that returns multiple/variable number of arguments
	private static int sum(int ...n) {
		int sum = 0;
		for (int a: n) {
			sum += a;
		}
		
		return sum;
	}
	
}
