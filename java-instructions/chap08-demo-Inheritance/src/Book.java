
public class Book extends Product {

	private String author;

	// generate empty constructor
	public Book() {
		super();
	}

	// generate fully loaded constructor and add instance variable declared in this class
	public Book(String code, String description, Double price, String author) {
		super(code, description, price);
		this.author = author;
	}

	// generate getters and setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", toString()=" + super.toString() + "]";
	}
	
}
