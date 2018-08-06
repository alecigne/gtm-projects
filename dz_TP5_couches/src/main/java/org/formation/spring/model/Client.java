package org.formation.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Client extends Personne {

	private String login;
	private String password;
	
	@Autowired
	private Adresse adresse;

	@Override
	public String toString() {
		return "Client [login=" + login + ", password=" + password + ", adresse=" + adresse + ", getPrenom()="
				+ getPrenom() + ", getNom()=" + getNom() + ", getId()=" + getId() + "]";
	}

}
