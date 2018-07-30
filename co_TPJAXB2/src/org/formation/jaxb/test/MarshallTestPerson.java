package org.formation.jaxb.test;

import java.io.File;
import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.formation.jaxb.model.Person;
import org.formation.jaxb.model.Person.Genre;

public class MarshallTestPerson {

	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.setFirstName("Jean");
		person1.setLastName("Dupont");
		person1.setBirthDate(LocalDate.of(2000, 12, 26));
		person1.setChilds(1);
		person1.setGenre(Genre.M);
		
		JAXBContext jaxb;
		
		try {
			jaxb = JAXBContext.newInstance(Person.class);
			Marshaller marshaller = jaxb.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(person1, System.out);
			marshaller.marshal(person1, new File("person.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}

}
