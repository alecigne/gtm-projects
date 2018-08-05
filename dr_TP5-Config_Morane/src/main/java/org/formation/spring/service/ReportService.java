package org.formation.spring.service;

import org.formation.spring.report.IReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportService {
	@Autowired
	IReportGenerator baba;
	private String auteur;

	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setBaba(IReportGenerator baba) {
		this.baba = baba;
	}

	public void generate(){
		baba.generate(getAuteur());
	}
}
