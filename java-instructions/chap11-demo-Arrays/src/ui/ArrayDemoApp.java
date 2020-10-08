package ui;

import java.util.Arrays;
import business.Product;

public class ArrayDemoApp {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		// array of 5 integers
		int[] numbers = new int[5];
		
		// add values by index position
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;

		// iterate through the array 
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// attempt to add a value to an index that is greater than the length of array
		// numbers[5] = 1; 
		// System.out.println(numbers[2] + "" + numbers[5]);	// this will result in Exception "Out of bounds"
		
		// an array of random numbers
		System.out.println("Array of random numbers: ");
		int[] randNumbers = new int[100];
		
		for (int i = 0; i < randNumbers.length; i++) {
			int r = (int)(Math.random()*100) + 1;
			randNumbers[i] = r;
			System.out.println(randNumbers[i]);
		}
				
		// an array of strings
		String[] names = {"Sean", "Jack", "Jonathan", "Ommaimah", "Marc", "Kali", "Tanya", "Hung"};
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		// an array of products
		Product p1 = new Product("java", "Murach's Java", 57.50);
		Product p2 = new Product("MySql", "Murach's mySql", 54.50);
		Product[] products = {p1, p2};
		
		for (int i=0; i<products.length; i++) {
			System.out.println(products[i]);		
		}
		
		// enhanced for loop
		Product p3 = new Product("java", "Murach's Java", 57.50);
		Product p4 = new Product("MySql", "Murach's mySql", 54.50);
		Product p5 = new Product("Android", "Murach's Android", 59.00);
	
		Product[] products2 = {p3, p4, p5};
		
		for (Product product: products2) {
			System.out.println(product);		
		}		
		
		// Arrays Class
		// sort the names
		Arrays.sort(names);
		for (String name: names) {
			System.out.println(name);
		}
				
		// binary search - search for index of a value
		int position = Arrays.binarySearch(names, "Kali");
		System.out.println(position);
		
		// sort Products
		Arrays.sort(products2);
		for(Product p: products2) {
			System.out.println(p);
		}
		
		System.out.println("Goodbye!");

	}

}
