package org.formation.spring.test;

import org.formation.spring.config.BankConfig;
import org.formation.spring.service.IPrestiBanqueService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP5 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
		IPrestiBanqueService service = context.getBean("service", IPrestiBanqueService.class);
		service.listClients();

	}

}
