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
	private String job;
	private static int nbInstances = 0;

	// *** CONSTRUCTORS ***

	public Person(String firstName, String lastName, String job) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		nbInstances++;
	}

	public Person(String firstName) {
		this(firstName, "Christ", "Carpenter");
	}

	public Person() {
		this("Jesus", "Christ", "Carpenter");
	}

	// *** ACCESSORS ***

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getJob() {
		return job;
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

	public void setJob(String job) {
		this.job = job;
	}

	// *** OTHER METHODS ***

	public String toString() {
		return this.firstName + " " + this.lastName + ", " + this.job + ".";
	}

}
