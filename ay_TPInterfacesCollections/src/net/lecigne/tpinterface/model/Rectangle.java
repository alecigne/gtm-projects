package net.lecigne.tpinterface.model;

public class Rectangle implements Surface {

	private double width;
	private double height;
	
	// *** CONSTRUCTORS ***
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle( ) {
	}

	// *** GETTERS & SETTERS  ***
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// *** OTHER METHODS ***
	
	@Override
	public double getArea() {
		double area = this.height * this.width;
		return area;
	}

}
