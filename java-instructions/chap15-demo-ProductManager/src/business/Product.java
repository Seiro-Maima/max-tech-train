package business;
// Product class follows rules of JavaBeans. 
// It is a true POGO (Plain Old Java Object)

import java.text.NumberFormat;

public class Product implements Comparable {

	// field - instance variables
	private String code;
	private String description;
	private double price;
	
	// empty - default constructor
	public Product() {
		
	}

	// fully loaded constructor
	public Product(String code, String description, Double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	};
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String inCode) {
		code = inCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// method to display currency format
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	// generated method that returns string
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + getPriceFormatted()
				+ "]";
	}

	@Override
	public int compareTo(Object arg0) {

		// confirm object is Product
		if( arg0 instanceof Product) {
			Product p = (Product) arg0; 	// casting o as a Product type
			return code.compareTo(p.getCode());
		}
		
		return 0;
	}
	
}
