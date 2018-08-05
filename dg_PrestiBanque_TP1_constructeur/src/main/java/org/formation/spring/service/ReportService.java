package org.formation.spring.service;

import org.formation.spring.report.IReportGenerator;

public class ReportService {

	private IReportGenerator repgen;
	private String auteur;

	public ReportService(IReportGenerator repgen) {
		this.repgen = repgen;
	}

	public void GenerateAnnualReport() {
		System.out.println("Pour l'année :");
		repgen.generate();
	}

	public void GenerateMonthlyReport() {
		System.out.println("Pour le mois :");
		repgen.generate();
	}

	public void GenerateDailyReport() {
		System.out.println("Pour la journée :");
		repgen.generate();
	}

}
