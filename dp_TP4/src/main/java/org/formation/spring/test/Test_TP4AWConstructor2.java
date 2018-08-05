package org.formation.spring.test;

import org.formation.spring.model.Client;
import org.formation.spring.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP4AWConstructor2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAWConstructor2.xml");
		Client client = context.getBean("client", Client.class);

		System.out.println(client);
	}

}
