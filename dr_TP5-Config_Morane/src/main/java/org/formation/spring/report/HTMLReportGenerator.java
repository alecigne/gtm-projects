package org.formation.spring.report;

import org.springframework.stereotype.Component;

@Component("baba")
public class HTMLReportGenerator implements IReportGenerator {

	@Override
	public void generate() {
		System.out.println(this.getClass().getName());

	}

	@Override
	public void generate(String auteur) {
		this.generate();
		System.out.println("-> Auteur : " + auteur);
	}

}
