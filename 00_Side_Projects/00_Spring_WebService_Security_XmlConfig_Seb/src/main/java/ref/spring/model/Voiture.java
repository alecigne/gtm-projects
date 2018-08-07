package ref.spring.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Voiture")
public class Voiture {

	private long id;
	private String couleur;
	private String marque;
	
	
	// *** Constructors ***
	public Voiture() {
	}

	public Voiture(String couleur, String marque) {
		this.couleur = couleur;
		this.marque = marque;
	}

	public Voiture(long id, String couleur, String marque) {
		this.id = id;
		this.couleur = couleur;
		this.marque = marque;
	}

	// *** Getters & Setters ***
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	// *** Methods ***
	@Override
	public String toString() {
		return "Voiture [id=" + id + ", couleur=" + couleur + ", marque=" + marque + "]";
	}
	
	
	
	
}
