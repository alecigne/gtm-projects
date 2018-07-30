package org.formation.jaxb.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "person")
// @XmlType(propOrder= {"firstName", "lastName", "childs", "birthDate"})
public class Person {

	public enum Genre {
		M, F;
	}
	
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private int childs;
	private Genre genre;

	public Person() {
	}

	public String getFirstName() {
		return firstName;
	}

	@XmlElement(name = "firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@XmlElement(name = "lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	@XmlJavaTypeAdapter(org.formation.jaxb.utils.LocalDateAdapter.class)
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getChilds() {
		return childs;
	}

	@XmlElement(name = "childs")
	public void setChilds(int childs) {
		this.childs = childs;
	}

	public Genre getGenre() {
		return genre;
	}

	@XmlAttribute(name="genre")
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", childs="
				+ childs + "]";
	}

}
