package net.lecigne.tpinterface.model;

public class Circle implements Surface, IPrintable {

	private double radius;
	
	// *** CONSTRUCTORS ***
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// *** GETTERS & SETTERS ***
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// *** OTHER METHODS ***

	@Override
	public double getArea() {
		double area = Math.PI * Math.pow(this.radius, 2);
		return area;
	}

	@Override
	public void printMe(String text) {
		String str = "Area of this circle: "
				+ this.getArea()
				+ " cm²";
		System.out.println(str);
	}

}