/* Create products from the Product Class
 * Print results to Console
 */

public class ProductManager {

	public static void main(String[] args) {

		System.out.println("Hello\n");
				
		// ----- create an instance with the empty constructor ----- 
		Product p1 = new Product();			// create an instance with the empty constructor
		printProductData(p1);				// currently null since no data has been entered

		p1.setCode("Java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(59.50);
		printProductData(p1);
		
		// ----- create an instance with the fully loaded constructor ----- 
		Product p2 = new Product("mySql", "Murach's MySQL", 54.50);
		printProductData(p2);
		
		// ----- generate output using toString() ----- 
		System.out.println("\nPrint Products Using toString()...");
		System.out.println(p1.toString());
		System.out.println(p2);	// will implicitly call the toString() since it overrides
		
		// ----- generate new price by reference -----
		System.out.println("Change price of p2...");
		changePrice(p2, 50);
		System.out.println(p2);
		
		// ----- generate new price by value -----
		System.out.println("Pass primitive type to a method...");
		double price = 700;
		changePrice1(price, 650);
		System.out.println("price = " + price);		// price will remain 700 not 650
		
		price = changePrice2(price, 750);
		System.out.println("price = " + price);		// price will now change correctly
		
		System.out.println("\nGoodbye!");		
	}
	
	// method to accept product and a new entered price and return price
	private static void changePrice (Product prod, double newPrice) {
		prod.setPrice(newPrice);
	}
		
	private static void changePrice1 (double price, double newPrice) {
		price = newPrice;
	}
	
	// same method as above, but allow a price change to take effect
	private static double changePrice2 (double price, double newPrice) {
		price = newPrice;
		return price;
	}	
	
	// method that accepts product instance and print information of product variables
	private static void printProductData(Product prod) {
		System.out.println("\nProduct Data: ");
		System.out.println(prod.getCode());
		System.out.println(prod.getDescription());
		System.out.println(prod.getPriceFormatted());	
	}
}
