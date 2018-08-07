package net.lecigne.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // pour indiquer qu'on va créer la table
public class UserDetails {

	@Id // pour indiquer que c'est une PK
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private int userId;
	private String username;

	public UserDetails() {
	}

	public UserDetails(String username) {
		this.username = username;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
