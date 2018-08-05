package org.formation.spring.test;

import org.formation.spring.model.Client;
import org.formation.spring.model.ClientAutoWired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP4_AutoWired_Annotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAutoWired.xml");
		ClientAutoWired clientAW = context.getBean("client", ClientAutoWired.class);
		System.out.println(clientAW);
	}

}
