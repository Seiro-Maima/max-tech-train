package ui;

import business.Product;

public class ProductFinderApp {

	// initialize an array of products
	private static Product[] products = new Product[3];
	
	public static void main(String[] args) {

		System.out.println("Hello");
		
		products[0] = new Product("java", "Murach's Java", 57.50);
		products[1] = new Product("mySql", "Murach's mySql", 57.50);
		products[2] = new Product("Android", "Murach's Android", 57.50);

		// provide a way for the user to search for a product
		String code = "";
		
		while(!code.equalsIgnoreCase("x")) {
			
			System.out.println("Search for a product\n");
			code = Console.getString("Enter code: ");
			Product p = getProduct(code);
			
			// print only if product is not null - product has been found
			if(p != null) {
				System.out.println("Product Found: " + p);
			}else {
				System.out.println("No product found for code: " + code);
			}
			
		}
		
		System.out.println("Goodbye!");
	}
	
	
	private static Product getProduct(String code) {
		
		Product p = null;
		
		// loop through array of products and find the code entered by user
		for (Product specificProduct: products) {
			if(specificProduct.getCode().equalsIgnoreCase(code)) {
				p = specificProduct;
			}
		}
		
		return p;
	}

}
