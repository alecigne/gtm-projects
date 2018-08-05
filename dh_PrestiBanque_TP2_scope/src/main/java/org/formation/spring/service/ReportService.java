package org.formation.spring.service;

import org.formation.spring.report.IReportGenerator;

public class ReportService {

	private IReportGenerator repgen;
	private String auteur;

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void generateAnnualReport() {
		System.out.println("Pour l'année :");
		repgen.generate(getAuteur()); // Getter plutôt que variable d'instance (si le getter fait quelque chose)
	}

	public void generateMonthlyReport() {
		System.out.println("Pour le mois :");
		repgen.generate(getAuteur());
	}

	public void generateDailyReport() {
		System.out.println("Pour la journée :");
		repgen.generate(getAuteur());
	}

	public void setRepgen(IReportGenerator repgen) {
		this.repgen = repgen;
	}

}
