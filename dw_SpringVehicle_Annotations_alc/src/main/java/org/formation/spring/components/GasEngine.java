package org.formation.spring.components;

import org.springframework.stereotype.Component;

@Component("gas")
public class GasEngine implements Motor {

	@Override
	public void makeSound() {
		System.out.println("Vroooom...");
	}

}
