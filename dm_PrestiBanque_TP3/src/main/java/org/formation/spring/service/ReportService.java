package org.formation.spring.service;

import org.formation.spring.report.IReportGenerator;

public class ReportService {
	IReportGenerator reportGenerator;
	private String auteur;

	public ReportService(IReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void generate() {
		reportGenerator.generate(getAuteur());
	}
}
