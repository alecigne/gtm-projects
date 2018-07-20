package net.lecigne.tpinterface.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestSurface {

	static Rectangle r1;
	static Circle c1;
	static Square s1;
	
	@BeforeAll
	static void initAll() {
		r1 = new Rectangle(2, 2);
		c1 = new Circle(10);
		s1 = new Square(5);
	}
	
	@Test
	void getAreaForRectangle() {
		double area = r1.getWidth() * r1.getHeight();
		assertTrue(area == r1.getArea());
	}
	
	@Test
	void getAreaForCircle() {
		double area = Math.PI * Math.pow(c1.getRadius(), 2);
		assertTrue(area == c1.getArea());
	}
	
	@Test
	void sumArea() {
		double totalSurface = r1.getArea() + c1.getArea() + s1.getArea();
		assertTrue(AreaCalculator.sumArea(r1, c1, s1) == totalSurface);
	}

}
