package org.formation.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class ClientAutoWired {
	private int id;
	private String nom;
	private String prenom;
	@Autowired
	private Adresse adresse;

	public ClientAutoWired(int id, String nom, String prenom, Adresse adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public ClientAutoWired(){
		
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	
	public ClientAutoWired(Adresse adresse) {
		super();
		this.adresse = adresse;
	}


	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}

	
}
