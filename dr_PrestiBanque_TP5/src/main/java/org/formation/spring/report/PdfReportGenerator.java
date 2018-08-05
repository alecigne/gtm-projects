package org.formation.spring.report;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReportGenerator implements IReportGenerator {

	@Override
	public void generate() {
		System.out.println("Génération d'un rapport PDF...");
	}

	@Override
	public void generate(String auteur) {
		this.generate();
		System.out.println("-> Auteur : " + auteur);
	}

}
