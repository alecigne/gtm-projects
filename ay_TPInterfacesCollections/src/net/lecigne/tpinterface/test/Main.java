package net.lecigne.tpinterface.test;

import net.lecigne.tpinterface.model.*;

public class Main {

	public static void main(String[] args) {

		Surface c1 = new Circle(10);
		Surface r1 = new Rectangle(10, 10);
		Surface s1 = new Square(10);
		
		Surface[] surfaces = { c1, r1, s1 };
		
		double sum = c1.getArea() + r1.getArea() + s1.getArea();
		System.out.println(sum);
		System.out.println(AreaCalculator.sumArea(surfaces));		

	}

}