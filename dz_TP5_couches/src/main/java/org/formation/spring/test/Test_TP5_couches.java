package org.formation.spring.test;

import org.formation.spring.config.PrestiBanqueConfig;
import org.formation.spring.model.Client;
import org.formation.spring.service.IPrestiBanqueService;
import org.formation.spring.service.PrestiBanqueService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_TP5_couches {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PrestiBanqueConfig.class);
		IPrestiBanqueService pbs = context.getBean(PrestiBanqueService.class);
		pbs.addClient(new Client());
		((ConfigurableApplicationContext) context).close();
	}
	
}
