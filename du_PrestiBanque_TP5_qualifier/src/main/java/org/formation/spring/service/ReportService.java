package org.formation.spring.service;

import org.formation.spring.report.IReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ReportService {
	
	@Autowired
	@Qualifier("HTMLReportGenerator")
	IReportGenerator repgen;
	private String auteur;

	public ReportService() {
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setRepgen(IReportGenerator reportGenerator) {
		this.repgen = reportGenerator;
	}

	public ReportService(IReportGenerator reportGenerator) {
		this.repgen = reportGenerator;
	}

	public void generate(){
		repgen.generate(getAuteur());
	}
}
