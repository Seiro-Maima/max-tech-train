package ui;

import business.LineItem;
import business.Product;
import business.Request;
import business.User;
import business.Vendor;
import ui.console.Console;

public class prsConsoleApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the PRS Console App!");
		
		// initialize variables
		int command = 0;
		
		// call method to display menu
		showMenu();
		
		// prompt user to enter command from menu
		command = Console.getInt("Command: ");

		// allow menu 
		while(command != 6) {
			
			switch(command) {
			
				case 1:		// add user
					
					User newUser = new User();
					System.out.println();
					System.out.println("Add a new user: ");
					
					newUser.setId(Console.getInt("Enter ID: "));
					newUser.setUserName(Console.getString("Enter User Name: "));
					newUser.setPassword(Console.getString("Enter Password: "));
					newUser.setFirstName(Console.getString("Enter First Name: "));
					newUser.setLastName(Console.getLine("Enter Last Name: "));
					newUser.setPhoneNumber(Console.getString("Enter Phone Number: "));
					newUser.setEmail(Console.getString("Enter Email: "));
					newUser.setReviewer(Console.getBoolean("Set to Reviewer? "));
					newUser.setAdmin(Console.getBoolean("Set to Admin? "));

					System.out.println();
					System.out.println(newUser.toString());
					
					break;
					
				case 2:		// add vendor
					
					Vendor newVendor = new Vendor();
					System.out.println();
					System.out.println("Add a new vendor: ");
					
					newVendor.setId(Console.getInt("Enter ID: "));
					newVendor.setCode(Console.getString("Enter Code: "));
					newVendor.setName(Console.getString("Enter Name: "));
					newVendor.setAddress(Console.getLine("Enter Address: "));
					newVendor.setCity(Console.getLine("Enter City: "));
					newVendor.setState(Console.getString("Enter State: "));
					newVendor.setZip(Console.getString("Enter Zip: "));
					newVendor.setPhoneNumber(Console.getString("Enter Phone Number: "));
					newVendor.setEmail(Console.getString("Enter Email: "));

					System.out.println();
					System.out.println(newVendor.toString());
										
					break;
					
				case 3:		// add product
					
					Product newProduct = new Product();
					System.out.println();
					System.out.println("Add a new product: ");
					
					newProduct.setId(Console.getInt("Enter ID: "));
					newProduct.setVendorID(Console.getInt("Enter Vendor ID: "));
					newProduct.setPartNumber(Console.getString("Enter Part Number: "));
					newProduct.setName(Console.getLine("Enter Name: "));
					newProduct.setPrice(Console.getDouble("Enter Price: "));
					newProduct.setUnit(Console.getString("Enter Unit: "));
					newProduct.setPhotoPath(Console.getLine("Enter Photo Path: "));

					System.out.println();
					System.out.println(newProduct.toString());
					
					break;
					
				case 4: 	// add request
			
					Request newRequest = new Request();
					System.out.println();
					System.out.println("Add a new Request: ");
					
					newRequest.setId(Console.getInt("Enter ID: "));
					newRequest.setUserID(Console.getInt("Enter User ID: "));
					newRequest.setDescription(Console.getLine("Enter Description: "));
					newRequest.setJustification(Console.getLine("Enter Justification: "));
					newRequest.setDateNeeded(Console.getString("Enter Date Needed: "));
					newRequest.setDeliveryMode(Console.getString("Enter Delivery Mode: "));
					newRequest.setStatus(Console.getString("Enter Status: "));
					newRequest.setTotal(Console.getDouble("Enter Total: "));
					newRequest.setSubmittedDate(Console.getString("Enter Submitted Date: "));
					newRequest.setReasonForRejection(Console.getLine("Enter Reason for Rejection: "));

					System.out.println();
					System.out.println(newRequest.toString());	
					
					break;
			
				case 5:		// add line item
					
					LineItem newLineItem = new LineItem();
					System.out.println();
					System.out.println("Add a new Line Item: ");
					
					newLineItem.setId(Console.getInt("Enter ID: "));
					newLineItem.setRequestID(Console.getInt("Enter Request ID: "));
					newLineItem.setProductID(Console.getInt("Enter Product ID: "));
					newLineItem.setQuantity(Console.getInt("Enter Quantity: "));
					
					System.out.println();
					System.out.println(newLineItem.toString());	
					
					break;
					
				case 6: 	// exit

					break;
					
				default:	// error handling for incorrect command number

					System.out.println("Invalid Command Number.");
			}
						
			// display menu again
			showMenu();
			command = Console.getInt("Command: ");
			
		}
		
		System.out.println();
		System.out.println("Have a good one!");
		
	}

	// method for displaying menu commands
	private static void showMenu() {
		
		System.out.println();
		System.out.println("====== Menu ======");
		System.out.println("1 - Add User");
		System.out.println("2 - Add Vendor");
		System.out.println("3 - Add Product");
		System.out.println("4 - Add Request");
		System.out.println("5 - Add Line Item");
		System.out.println("6 - Exit");
		System.out.println("==================");
		System.out.println();

	}

}
