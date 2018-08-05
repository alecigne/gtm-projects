package org.formation.spring.test;

import java.io.Closeable;
import java.io.IOException;

import org.formation.spring.model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP4_ByType {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansByType.xml");
		Client client = context.getBean("client", Client.class);
		System.out.println(client);
//		((ConfigurableApplicationContext) context).close();
		try {
			((Closeable) context).close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
