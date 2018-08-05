package org.formation.spring.test;

import org.formation.spring.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ReportService rs = context.getBean("reportservice", ReportService.class);
		rs.generateDailyReport();
	}

}
