package net.lecigne.mavenwebsql.model;

public class Client {

	int idClient;
	String nom;
	String prenom;

	public Client(String nom, String prenom) {
		super();
		this.prenom = nom;
		this.nom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

}
