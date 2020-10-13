package business;

import java.time.LocalDate;

public class Actor {
	
	// instance variables
	private int id;
	private String firstName; 
	private String lastName;
	private String gender;
	private LocalDate birthDate;
	
	// default constructor
	public Actor() {
		super();
	}

	// fully loaded constructor
	public Actor(int id, String firstName, String lastName, String gender, LocalDate birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	// display actor summary
	public String actorSummary() {
		String str;
		str = "id: " + id + ", " + firstName + " " + lastName + ", " 
		+ (gender.equalsIgnoreCase("M") ? "Male":"Female") 
		+ ", born " + birthDate;
				
		return str;
	}
}
