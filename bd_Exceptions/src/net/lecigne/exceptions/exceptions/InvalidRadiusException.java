package net.lecigne.exceptions.exceptions;

public class InvalidRadiusException extends Exception {
	// Warning : car Exceptions = serializable, on doit générer un UID
	
	private double radius;
	
	public InvalidRadiusException(double radius) {
		super("Invalid radius: " + radius);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

}
