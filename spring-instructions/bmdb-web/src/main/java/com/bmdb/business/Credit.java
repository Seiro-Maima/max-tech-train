package com.bmdb.business;

import javax.persistence.*;

@Entity
public class Credit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	@ManyToOne
	@JoinColumn(name="ActorID")		// tell it what column to join on
	private Actor actor;
	@ManyToOne
	@JoinColumn(name="MovieID")
	private Movie movie;
	private String role;
	
	public Credit() {
		super();
	}

	public Credit(int iD, Actor actor, Movie movie, String role) {
		super();
		ID = iD;
		this.actor = actor;
		this.movie = movie;
		this.role = role;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
