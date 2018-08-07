package org.formation.springjavaautowire.tests;

import org.formation.springjavaautowire.config.ClientConfig;
import org.formation.springjavaautowire.model.ClientAutoWired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class);
		ClientAutoWired clientAW = context.getBean(ClientAutoWired.class);
		System.out.println(clientAW);
	}

}
