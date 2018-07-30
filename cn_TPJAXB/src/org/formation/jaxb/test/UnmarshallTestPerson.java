package org.formation.jaxb.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.formation.jaxb.model.Person;

public class UnmarshallTestPerson {

	public static void main(String[] args) {

		JAXBContext jaxb;
		Person person = null;

		try {
			jaxb = JAXBContext.newInstance(Person.class);
			Unmarshaller unmarshaller = jaxb.createUnmarshaller();
			person = (Person) unmarshaller.unmarshal(new File("person.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		System.out.println(person);

	}

}
