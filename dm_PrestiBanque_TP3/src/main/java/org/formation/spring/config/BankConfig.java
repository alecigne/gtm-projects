package org.formation.spring.config;

import org.formation.spring.report.IReportGenerator;
import org.formation.spring.report.ReportFactory;
import org.formation.spring.report.ReportGenerator;
import org.formation.spring.service.ReportService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BankConfig {

    @Bean
    public ReportGenerator htmlReport() {
    	return ReportFactory.createReport("html");
    }
    
    @Bean
    public ReportGenerator pdfReport() {
    	return ReportFactory.createReport("pdf");
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ReportService report(IReportGenerator htmlReport) {
		return new ReportService(htmlReport);
    }
    
}
