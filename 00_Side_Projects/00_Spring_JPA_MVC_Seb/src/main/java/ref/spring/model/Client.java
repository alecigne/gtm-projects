package ref.spring.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Client extends Personne {

	@Autowired
	@Embedded
	private Adresse adresse;

	// *** Constructors ***
	public Client() {
		super();
	}

	public Client(String nom, Adresse adresse) {
		super(nom);
		this.adresse = adresse;
	}

	// *** Methods ***
	@Override
	public String toString() {
		return super.toString() + " - " + adresse;
	}

}
