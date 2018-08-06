package org.formation.spring.test;

import org.formation.spring.service.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
		vehicle.go();

	}

}
