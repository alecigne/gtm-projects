package org.formation.spring.config;

import org.formation.spring.report.HTMLReportGenerator;
import org.formation.spring.report.IReportGenerator;
import org.formation.spring.report.PDFReportGenerator;
import org.formation.spring.service.ReportService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BankConfig {

    @Bean
    public IReportGenerator htmlReport() {
    	return new HTMLReportGenerator();
    }
    
    @Bean
    public IReportGenerator pdfReport() {
    	return new PDFReportGenerator();
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ReportService report(IReportGenerator htmlReport) {
		return new ReportService(htmlReport);
    }
    
}
