import java.util.ArrayList;

public class NumberListApp {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		
		System.out.println(numbers);
		
		// add value at specified index
		numbers.add(1, 10);
		System.out.println(numbers);
		
		// get method
		System.out.println(numbers.get(2));
		
		System.out.println("Bye");
		
	}

}
