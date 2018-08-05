package org.formation.spring.test;

import org.formation.spring.config.BankConfig;
import org.formation.spring.service.ReportService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
		ReportService rs = context.getBean(ReportService.class);
		rs.setAuteur("Auteur 1");
		rs.generate();		
	}

}
