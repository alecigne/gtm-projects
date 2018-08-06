package org.formation.spring.model;

public class Personne {

	private String prenom;
	private String nom;
	private int id;

	public Personne() {
	}

	public Personne(String prenom, String nom, int id) {
		this.prenom = prenom;
		this.nom = nom;
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
