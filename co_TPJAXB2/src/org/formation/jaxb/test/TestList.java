package org.formation.jaxb.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.formation.jaxb.model.Person;
import org.formation.jaxb.model.Persons;

public class TestList {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setFirstName("a");
		p1.setLastName("b");
		Person p2 = new Person();
		p2.setFirstName("c");
		p2.setLastName("d");
		Person p3 = new Person();
		p3.setFirstName("e");
		p3.setLastName("f");
		
		Persons persons = new Persons();
		
		persons.addPerson(p1);
		persons.addPerson(p2);
		persons.addPerson(p3);
		
		JAXBContext jaxb;
		
		try {
			jaxb = JAXBContext.newInstance(Persons.class);
			Marshaller marshaller = jaxb.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(persons, new File("persons.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
