package com.bmdb.business;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	private String FirstName;
	private String LastName;
	private String Gender;
	private LocalDate BirthDate;
	
	public Actor() {
		super();
	}
	
	public Actor(int ID, String FirstName, String LastName, String Gender, LocalDate BirthDate) {
		super();
		this.ID = ID;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Gender = Gender;
		this.BirthDate = BirthDate;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}

	public LocalDate getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(LocalDate BirthDate) {
		this.BirthDate = BirthDate;
	}
	
}
