package org.formation.spring.components;

public class ElectricMotor implements Motor {

	@Override
	public void makeSound() {
		System.out.println("Bzzzz...");
	}

}
