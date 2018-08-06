package org.formation.spring.test;

import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.formation.spring.service.IPrestiBanqueService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP5 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IPrestiBanqueService service = context.getBean("service", IPrestiBanqueService.class);
		Client c = new Client("toto", "1234", new Adresse(2, "rue", "ville"));
		service.addClient(c);
		System.out.println(service.editClient(1));
		service.deleteClient(1);
		((ConfigurableApplicationContext) context).close();
	}

}
