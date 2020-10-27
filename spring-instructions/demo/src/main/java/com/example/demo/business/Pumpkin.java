package com.example.demo.business;

public class Pumpkin {

	// instance variables
	private int id;
	private String color;
	private double weight;
	private double height;
	private double width;
	private boolean decorated;
	
	// constructors
	public Pumpkin() {
		super();
	}

	public Pumpkin(int id, String color, double weight, double height, double width, boolean decorated) {
		super();
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.height = height;
		this.width = width;
		this.decorated = decorated;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean isDecorated() {
		return decorated;
	}

	public void setDecorated(boolean decorated) {
		this.decorated = decorated;
	}	
	
}
