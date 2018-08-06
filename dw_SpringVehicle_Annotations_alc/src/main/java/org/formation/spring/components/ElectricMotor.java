package org.formation.spring.components;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricMotor implements Motor {

	@Override
	public void makeSound() {
		System.out.println("Bzzzz...");
	}

}
