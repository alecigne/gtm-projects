package net.lecigne.exceptions.model;

public class Circle {

	double radius;

	public Circle(double radius) {
		this.setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Radius cannot be negative");
		} else {
			this.radius = radius;
		}
	}
	
}
