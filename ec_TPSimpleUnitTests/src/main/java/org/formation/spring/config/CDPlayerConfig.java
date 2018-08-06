package org.formation.spring.config;

import org.formation.spring.cd.CDPlayer;
import org.formation.spring.cd.CompactDisc;
import org.formation.spring.cd.SgtPeppers;
import org.springframework.context.annotation.Bean;

public class CDPlayerConfig {

	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}
	
}
