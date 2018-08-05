package org.formation.spring.test;

import org.formation.spring.model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP4_ByName {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansByName.xml");
		Client client = context.getBean("client", Client.class);
		System.out.println(client);
	}

}
