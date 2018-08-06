package org.formation.spring.components;

import org.springframework.stereotype.Component;

@Component("grandma")
public class GrandMother implements Driver {

	@Override
	public void drivingStyle() {
		System.out.println("as slow as possible.......");
	}

}
