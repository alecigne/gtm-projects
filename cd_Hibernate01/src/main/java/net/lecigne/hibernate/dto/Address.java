package net.lecigne.hibernate.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	String street;
	String city;

	public Address() {
	}
	
	public Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
