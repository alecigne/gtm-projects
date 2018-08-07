package org.formation.spring.test;

import org.formation.spring.config.VehicleConfig;
import org.formation.spring.service.Vehicle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);
		Vehicle vehicle = context.getBean(Vehicle.class);
		// change the sound in the VehicleConfig class
		vehicle.go();
	}

}