package org.formation.spring.components;

public class GasEngine implements Motor {

	@Override
	public void makeSound() {
		System.out.println("Vroooom...");
	}

}
