package net.lecigne.vehicles.model;

public class Car extends Vehicle {

	private boolean convertible;
	
	public Car(String model, String color, boolean convertible) {
		super(model, color);
		this.convertible = convertible;
	}
	
}
