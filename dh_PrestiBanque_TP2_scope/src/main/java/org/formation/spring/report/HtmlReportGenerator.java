package org.formation.spring.report;

public class HtmlReportGenerator implements IReportGenerator {

	@Override
	public void generate() {
		System.out.println("Génération d'un rapport HTML...");
	}

	@Override
	public void generate(String auteur) {
		this.generate();
		System.out.println("-> Auteur : " + auteur);
	}

}
