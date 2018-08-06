package net.lecigne.httpfilter.model;

public class User {

	// *** ATTRIBUTES ***

	private int id;
	private String login;
	private String password;

	// *** CONSTRUCTORS ***

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	// *** GETTERS and SETTERS ***

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	// *** OTHER METHODS ***

	@Override
	public String toString() {
		return "Client [login=" + login + ", password=" + password + "]";
	}

}