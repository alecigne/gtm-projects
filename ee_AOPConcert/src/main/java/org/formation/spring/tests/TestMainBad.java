package org.formation.spring.tests;

import org.formation.spring.config.ConcertConfig;
import org.formation.spring.model.IPerformance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainBad {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
		IPerformance concert = context.getBean("badconcert", IPerformance.class);
		concert.perform();
	}

}
