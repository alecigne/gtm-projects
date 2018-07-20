package net.lecigne.constructeur.model;

/**
 * Builds a person object, with a first name, last name, a job. The total number
 * of instances is tracked through a static variable.
 * 
 * @author Anthony Le Cigne
 *
 */

public class Person {

	// *** ATTRIBUTES ***

	private String firstName;
	private String lastName;
	private static int nbInstances = 0;

	// *** CONSTRUCTORS ***

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		nbInstances++;
	}

	public Person() {
		this("Person", "Lambda");
	}

	// *** ACCESSORS ***

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public static int getNbInstances() {
		return nbInstances;
	}

	// *** MUTATORS ***

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// *** OTHER METHODS ***

	public String toString() {
		return this.firstName
				+ " " 
				+ this.lastName + ".";
	}

}
