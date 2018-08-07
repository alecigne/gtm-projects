package org.formation.springjavaautowire.model;

import org.springframework.beans.factory.annotation.Autowired;

public class ClientAutoWired {

	private int id;
	private String nom;
	private String prenom;
	
//	@Autowired
	private Adresse adresse;

	public ClientAutoWired() {
	}
	
	public ClientAutoWired(Adresse adresse) {
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
