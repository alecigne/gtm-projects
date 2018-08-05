package org.formation.spring.test;

import org.formation.spring.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ReportService rs1 = context.getBean("reportservice", ReportService.class);
		ReportService rs2 = context.getBean("reportservice", ReportService.class);
		rs1.setAuteur("Auteur 1");
		rs2.setAuteur("Auteur 2");
		rs1.generateAnnualReport();
		rs2.generateAnnualReport();
	}

}
