
public class ProductMangerApp {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		Product p1 = new Product("java", "Murach's Java Programming", 55.50);
		System.out.println(p1.toString());
		
		Book b1 = new Book("mySql", "Murach's MySql", 54.50, "Joel Murach");
		System.out.println(b1.toString());		
		
		Software s1 = new Software ("eclipse", "STS Esclipse", 0.0, "4.6.1.RELEASE");
		System.out.println(s1);
		
		// demo code that uses overridden methods
		Product p2 = s1;	// this does not create a new object in memory since there is no "new" keyword
		// p2 is now pointing at the same object in memory as s1
		System.out.println("p2 toString...");
		System.out.println(p2);	// this will print s1 output
		
		// example of instanceof keyword
		if(p2 instanceof Book) {
			System.out.println("p2 is a book!");
		}else if(p2 instanceof Software) {
			System.out.println("p2 is a software!");
		}
		
	
		
		
		System.out.println("Byeee!");
		
	}

}
