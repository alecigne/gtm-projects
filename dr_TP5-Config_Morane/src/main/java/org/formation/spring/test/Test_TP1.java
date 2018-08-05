package org.formation.spring.test;

import org.formation.spring.config.BankConfig;
import org.formation.spring.report.HTMLReportGenerator;
import org.formation.spring.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP1 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
		ReportService reportService =context.getBean("reportService", ReportService.class);
	
		reportService.generate();

	}

}
