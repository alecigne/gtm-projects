package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="persons")
public class Persons {
	List<Person> persons = new ArrayList<>();

	public List<Person> getPersons() {
		return persons;
	}

	@XmlElement(name="person")
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	public void add(Person p){
		persons.add(p);
	}

	@Override
	public String toString() {
		return "Persons [persons=" + persons + "]";
	}
	
	
}
