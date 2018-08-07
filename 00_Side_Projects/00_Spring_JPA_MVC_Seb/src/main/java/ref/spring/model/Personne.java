package ref.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.stereotype.Component;

@Component
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String nom;

	// *** Constructors ***
	public Personne() {
	}

	public Personne(String nom) {
		this.nom = nom;
	}

	// *** Getters & Setters ***
	public int getId() { // Pour l'affichage dans le jsp
		return id;
	}

	// *** Methods ***
	@Override
	public String toString() {
		return "(" + id + ")" + nom;
	}

}
