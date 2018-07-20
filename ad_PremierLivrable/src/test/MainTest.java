package test;

import model.Car;

public class MainTest {

	public static void main(String[] args) {
		
		// Car 1
		Car car1 = new Car();
		
		car1.setModel("Chevrolet Chevelle");
		car1.setOwner("Alice");
		
		System.out.println(car1);
		
		// Car 2
		Car car2 = new Car();
		
		car2.setModel("Ford Mustang");
		car2.setOwner("Bob");
		
		System.out.println(car2);
		
	}

}
