package org.formation.spring.test;

import org.formation.spring.config.BankConfig;
import org.formation.spring.service.ReportService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP2b {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
		ReportService rs1 = context.getBean(ReportService.class);
		ReportService rs2 = context.getBean(ReportService.class);
		rs1.setAuteur("Auteur 1");
		rs2.setAuteur("Auteur 2");
		rs1.generate();		
		rs2.generate();
	}

}
