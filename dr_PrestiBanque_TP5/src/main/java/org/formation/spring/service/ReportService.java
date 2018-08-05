package org.formation.spring.service;

import org.formation.spring.report.IReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ReportService {

	@Autowired
	private IReportGenerator html;
	private String auteur;

	public ReportService(IReportGenerator repgen) {
		this.html = repgen;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void generateAnnualReport() {
		System.out.println("Pour l'année :");
		html.generate(getAuteur()); // Getter plutôt que variable d'instance (si le getter fait quelque chose)
	}

	public void generateMonthlyReport() {
		System.out.println("Pour le mois :");
		html.generate(getAuteur());
	}

	public void generateDailyReport() {
		System.out.println("Pour la journée :");
		html.generate(getAuteur());
	}

	public void setHtml(IReportGenerator repgen) {
		this.html = repgen;
	}

}
