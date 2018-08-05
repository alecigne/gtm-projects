package org.formation.spring.test;

import java.io.Closeable;
import java.io.IOException;

import org.formation.spring.model.ClientAutoWired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP4AWired {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAWired.xml");
		ClientAutoWired client = context.getBean("client", ClientAutoWired.class);

		System.out.println(client);
		((ConfigurableApplicationContext) context).close();
		
//		try {
//			((Closeable)context).close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
