package net.lecigne.exceptions.model;

import net.lecigne.exceptions.exceptions.InvalidRadiusException;

public class CircleCustomEx {

	double radius;

	public CircleCustomEx(double radius) throws InvalidRadiusException {
		this.setRadius(radius);
	}
	
	public void setRadius(double radius) throws InvalidRadiusException  {
		if (radius < 0) {
			throw new InvalidRadiusException(radius);
		} else {
			this.radius = radius;
		}
	}
	
}
