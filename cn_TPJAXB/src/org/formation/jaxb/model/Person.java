package org.formation.jaxb.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "person")
public class Person {

	String firstName;
	String lastName;
	LocalDate birthDate;
	int childs;

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

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", childs="
				+ childs + "]";
	}

}
