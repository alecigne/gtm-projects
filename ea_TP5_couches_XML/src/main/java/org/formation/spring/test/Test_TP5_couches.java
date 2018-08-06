package org.formation.spring.test;

import org.formation.spring.model.Client;
import org.formation.spring.service.IPrestiBanqueService;
import org.formation.spring.service.PrestiBanqueService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP5_couches {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IPrestiBanqueService pbs = context.getBean("prestiBanqueService", PrestiBanqueService.class);
		Client client = context.getBean("client", Client.class);
		pbs.addClient(client);
	}
	
}
