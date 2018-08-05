package org.formation.spring.service;

import org.formation.spring.report.IReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportService {
	
	@Autowired
	IReportGenerator pdf;
	private String auteur;

	public ReportService() {
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setPdf(IReportGenerator reportGenerator) {
		this.pdf = reportGenerator;
	}

	public ReportService(IReportGenerator reportGenerator) {
		this.pdf = reportGenerator;
	}

	public void generate(){
		pdf.generate(getAuteur());
	}
}
