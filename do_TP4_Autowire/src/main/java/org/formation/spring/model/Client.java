package org.formation.spring.model;

public class Client {

	private int id;
	private String nom;
	private String prenom;
	private Adresse adresse;

	public Client() {
	}

	// Candidat manquant dans le beansByConstructor.xml
	public Client(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}

}
