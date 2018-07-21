package net.lecigne.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String username;
	
	@OneToMany(cascade = CascadeType.ALL) // Un utilisateur peut avoir plusieurs véhicules
	private Collection<Vehicle> vehicles = new ArrayList<>(); // Le size marchera ici car on a un objet

	@Embedded
	Address address;

	public UserDetails() {
	}

	public UserDetails(String username, String street, String city) {
		Address address = new Address(street, city);
		this.username = username;
		this.address = address;
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

	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", username=" + username + ", vehicles=" + vehicles + ", address="
				+ address + "]";
	}

}
