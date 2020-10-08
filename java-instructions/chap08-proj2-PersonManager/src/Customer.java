
public class Customer extends Person{

	// instance variable
	private String customerNumber;

	// default constructor
	public Customer() {
		super();
	}
	
	// fully loaded constructor
	public Customer(String firstName, String lastName, String customerNumber) {
		super(firstName, lastName);
		this.customerNumber = customerNumber;
	}

	// getters and setters
	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Customer Number: " + customerNumber;
	}
	
}
