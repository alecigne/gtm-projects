package org.formation.spring.model;

import org.springframework.stereotype.Component;

@Component("badconcert")
public class BadConcert implements IPerformance {

	@Override
	public void perform() {
		System.out.println("Patrick Sébastien - Les Sardines");
		throw new RuntimeException("Musique insupportable");
	}

}
