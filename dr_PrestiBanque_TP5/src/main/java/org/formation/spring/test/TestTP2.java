package org.formation.spring.test;

import org.formation.spring.config.BankConfig;
import org.formation.spring.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTP2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
		ReportService rs1 = context.getBean(ReportService.class);
		rs1.generateAnnualReport();
	}

}
