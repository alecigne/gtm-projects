package org.formation.jaxb.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.formation.jaxb.model.Persons;

public class UnmarshallTestPersons {

	public static void main(String[] args) {

		JAXBContext jaxb;
		Persons persons = null;
		
		try {
			jaxb = JAXBContext.newInstance(Persons.class);
			Unmarshaller unmarshaller = jaxb.createUnmarshaller();
			persons = (Persons) unmarshaller.unmarshal(new File("persons.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		System.out.println(persons);

	}

}
