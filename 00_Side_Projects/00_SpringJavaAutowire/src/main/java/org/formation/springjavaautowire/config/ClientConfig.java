package org.formation.springjavaautowire.config;

import org.formation.springjavaautowire.model.Adresse;
import org.formation.springjavaautowire.model.ClientAutoWired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Bean
    public Adresse adresse() {
    	return new Adresse();
    }
    
    @Bean
    public ClientAutoWired client(Adresse adresse) {
    	adresse.setVille("Paris");
		return new ClientAutoWired(adresse);
    }
	
}
