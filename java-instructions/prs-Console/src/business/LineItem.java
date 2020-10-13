package business;

public class LineItem {

	// ---------- instance variables ----------
	private int id;
	private int requestID;
	private int productID;
	private int quantity;

	// ---------- constructors ----------
	public LineItem() {
		super();
	}
	
	public LineItem(int id, int requestID, int productID, int quantity) {
		super();
		this.id = id;
		this.requestID = requestID;
		this.productID = productID;
		this.quantity = quantity;
	}

	
	// ---------- getters and setters ----------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		
		return "===============================\n" +
				"Line Item Summary: \n" +
				"===============================\n" +
				"ID: " + id + "\n" +
				"Request ID: " + requestID +  "\n" +
				"Product ID: " + productID + "\n" +
				"Quantity: " + quantity + "\n";
	}
	
}
