package db;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.Product;

public class ProductTextFile implements DAO<Product> {

	private List<Product> products = null;
	private Path productsPath = null;
	private File productsFile = null;
	private final String FIELD_SEP = "\t";
		
	public ProductTextFile() {
		productsPath = Paths.get("products.txt");
		productsFile = productsPath.toFile();
		products = getAll();
	}

	@Override
	public Product get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	// get all products from text file if list is null
	@Override
	public List<Product> getAll() {
		if(products != null) {
			return products;
		}
		products = new ArrayList<>();
		
		if(Files.exists(productsPath)){
			try(BufferedReader in = new BufferedReader(
								    new FileReader(productsFile))){
			}catch(IOException ioe) {
				System.out.println(ioe);
				return null;
			}
		}
		
		else {
			System.out.println(productsPath.toAbsolutePath() + " doesn't exist.");
			return null;
		}
		
		return null;
	}

	@Override
	public boolean add(Product t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Product t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Product t) {
		// TODO Auto-generated method stub
		return false;
	}

}
