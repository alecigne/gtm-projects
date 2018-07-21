package net.lecigne.onetoone.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	private String name;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "passport_id", unique = true)
	private Passport passport;

	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + "]";
	}

}
