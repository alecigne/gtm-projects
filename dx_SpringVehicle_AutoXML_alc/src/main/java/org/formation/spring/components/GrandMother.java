package org.formation.spring.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GrandMother implements Driver {

	@Override
	public void drivingStyle() {
		System.out.println("as slow as possible.......");
	}

}
