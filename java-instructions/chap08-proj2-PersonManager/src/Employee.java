
public class Employee extends Person{

	// instance variables
	private String ssn;

	// default constructor
	public Employee() {
		super();
	}

	// fully loaded constructor
	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	// getters and setters
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// toString for Employee
	@Override
	public String toString() {
		return super.toString() + "\n SSN: XXX-XX-" + ssn.substring(7);
	}

}
