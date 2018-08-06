package org.formation.spring.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component("client")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Client extends Personne {

	// private int id;
	private String login;
	private String password;

	@Autowired
	@Embedded
	private Adresse adresse;

	public Client(String login, String password, Adresse adresse) {
		// this.id = id;
		this.login = login;
		this.password = password;
		this.adresse = adresse;
	}

	public Client() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Client(Adresse adresse) {
		super();
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [login=" + login + ", password=" + password + ", adresse=" + adresse + "]";
	}

}
