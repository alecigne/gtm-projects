package org.formation.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Client extends Personne {

	private String login;
	private String password;
	private Adresse adresse;

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [login=" + login + ", password=" + password + ", adresse=" + adresse + ", getPrenom()="
				+ getPrenom() + ", getNom()=" + getNom() + ", getId()=" + getId() + "]";
	}

}
