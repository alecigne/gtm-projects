package org.formation.spring.tests;

import org.formation.spring.config.ConcertConfig;
import org.formation.spring.model.IPerformance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainGood {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
		IPerformance concert = context.getBean("concert", IPerformance.class);
		concert.perform();
	}

}
