package org.formation.spring.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ElectricMotor implements Motor {

	@Override
	public void makeSound() {
		System.out.println("Bzzzz...");
	}

}
