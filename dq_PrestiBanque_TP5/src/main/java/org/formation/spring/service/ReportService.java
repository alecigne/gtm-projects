package org.formation.spring.service;

import org.formation.spring.report.IReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportService {
	
	@Autowired
	IReportGenerator HTMLReportGenerator;
	private String auteur;

	public ReportService() {
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setHTMLReportGenerator(IReportGenerator reportGenerator) {
		this.HTMLReportGenerator = reportGenerator;
	}

	public ReportService(IReportGenerator reportGenerator) {
		this.HTMLReportGenerator = reportGenerator;
	}

	public void generate(){
		HTMLReportGenerator.generate(getAuteur());
	}
}
