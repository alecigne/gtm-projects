package org.formation.spring.report;

import org.springframework.stereotype.Component;

@Component
public interface IReportGenerator {

	void generate();
	
	void generate(String auteur);
	
}
