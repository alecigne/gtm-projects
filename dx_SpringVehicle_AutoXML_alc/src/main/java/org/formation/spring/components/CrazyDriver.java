package org.formation.spring.components;

import org.springframework.stereotype.Component;

@Component
public class CrazyDriver implements Driver {

	@Override
	public void drivingStyle() {
		System.out.println("very fast!!!");
	}

}
