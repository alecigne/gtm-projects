package org.formation.spring.test;

import org.formation.spring.service.ReportService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByXML {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ReportService reportService = context.getBean("reportService", ReportService.class);
		reportService.setAuteur("Bob");
		reportService.generate();
	}

}
