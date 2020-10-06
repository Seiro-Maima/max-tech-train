
public class ProductManagerApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Hello!");

		Product p = new Product("java", "Murach's Java", 57.50);
		p.print();
		
		//Employee e = new Employee("Harry", "James", "111-555-666", 2);
		printMultiple(p, 5);
		//printMultiple(e, 3);
		
		// clone some products - now way to do this now
		Product p1 = new Product("java", "Murach's Java", 57.50);
		//Product p2 = p1.clone(); // error - can't convert from object to Product
		Product p2 = (Product) p1.clone();	// have to add throws exception
		
		System.out.println("Bye!");
	}
	
	// method will accept Printable type and print it
	private static void printMultiple(Printable p, int count) {
		for (int i = 0; i < count; i++) {
			p.print();
		}
	}

}
