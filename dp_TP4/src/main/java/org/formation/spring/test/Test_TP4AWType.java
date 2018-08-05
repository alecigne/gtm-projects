package org.formation.spring.test;

import org.formation.spring.model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP4AWType {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAWType.xml");
		Client client = context.getBean("client", Client.class);

		System.out.println(client);
		
		((ConfigurableApplicationContext)context).close();
	}

}
