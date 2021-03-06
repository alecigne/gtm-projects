package ref.spring.model;

import javax.persistence.Embeddable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Embeddable
@Component
public class Adresse {

	private String ville;

	// *** Constructors ***
	public Adresse() {
	}

	public Adresse(String ville) {
		this.ville = ville;
	}
	
	// *** Getters & Setters ***
	// Pour l'affichage dans le webService
	public String getVille() {
		return ville;
	}
	
	// *** Methods ***
	@Override
	public String toString() {
		return ville;
	}



}
