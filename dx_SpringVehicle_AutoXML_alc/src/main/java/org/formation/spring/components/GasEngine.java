package org.formation.spring.components;

import org.springframework.stereotype.Component;

@Component
public class GasEngine implements Motor {

	@Override
	public void makeSound() {
		System.out.println("Vroooom...");
	}

}
