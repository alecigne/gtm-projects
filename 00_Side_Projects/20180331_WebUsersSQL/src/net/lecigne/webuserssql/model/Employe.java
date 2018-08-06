package net.lecigne.webuserssql.model;

/**
 * Cette classe abstraite factorise les caractéristiques des employés
 * ProxiBanque (conseillers et gérants).
 * 
 * @author Anthony Le Cigne
 *
 */

public abstract class Employe {

	// *** ATTRIBUTS ***

	private String login;
	private String password;
	private String nom;
	private String prenom;

	// *** CONSTRUCTEUR(S) ***

	public Employe(String password, String nom, String prenom) {
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}

	// *** GETTERS et SETTERS ***

	public String getLogin() {
		return login;
	}

	// Ceci est nécessaire pour une attribution automatique de login
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	// *** OTHER METHODS ***

	@Override
	public String toString() {
		return "[login=" + login + ", password=" + password + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}

}
