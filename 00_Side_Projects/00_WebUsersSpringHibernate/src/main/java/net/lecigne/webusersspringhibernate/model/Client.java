package net.lecigne.webusersspringhibernate.model;

public class Client extends Personne {

	// *** ATTRIBUTES ***

	private String login;
	private String password;

	// *** CONSTRUCTORS ***

	public Client(String nom, String prenom, Adresse adresse, String login, String password) {
		super(nom, prenom, adresse);
		this.login = login;
		this.password = password;
	}

	// *** GETTERS and SETTERS ***

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

	// *** OTHER METHODS ***

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse.toString()
				+ ", login=" + login + ", password=" + password + "]";
	}

}