package org.formation.spring.model;

import org.springframework.stereotype.Component;

@Component("concert")
public class Concert implements IPerformance {

	@Override
	public void perform() {
		System.out.println("The B-52's - Mesopotamia");
	}

}
