package org.formation.spring.test;

import org.formation.spring.service.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
		// change the motor in beans.xml to change the sound
		// change the driver to change the driving style
		vehicle.go();
	}

}
