
public class Software extends Product {

	// instance variable
	private String version;

	// generate default constructor
	public Software() {
		super();
	}

	// generate a fully loaded constructor
	public Software(String code, String description, Double price, String version) {
		super(code, description, price);
		this.version = version;
	}

	// generate getters and setters
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Software [version=" + version + ", toString()=" + super.toString() + "]";
	}
}
