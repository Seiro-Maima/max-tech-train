
public class Employee extends Person implements Printable, DepartmentConstants{

	// instance variables
	private String ssn;
	private int department;

	// default constructor
	public Employee() {
		super();
	}

	// fully loaded constructor
	public Employee(String firstName, String lastName, String ssn, int dept) {
		super(firstName, lastName);
		this.ssn = ssn;
		this.department = dept;
	}

	// getters and setters
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	// toString for Employee
	@Override
	public String toString() {
		return super.toString() + "\n SSN: XXX-XX-" + ssn.substring(7);
	}

	// return first name, last name, and department description
	@Override
	public void print() {
		String dept = "Unknown"; // if department name doesn't match the constants
		if(department == ADMIN) {
			dept = "Administration";
		}
		else if(department == EDITORIAL)
			dept = "Editorial";
		else if(department == MARKETING) {
			dept = "Marketing";
		}

		System.out.println("First Name: " + firstName + "Last Name: " + lastName + "(" + department + ")");
	}

}
