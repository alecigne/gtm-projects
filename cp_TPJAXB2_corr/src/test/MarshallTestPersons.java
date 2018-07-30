package test;

import java.io.File;
import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import model.Person;
import model.Persons;
import model.Person.Sex;

public class MarshallTestPersons {

	public static void main(String[] args) {
		try {
			Person person = new Person();
			person.setBirthDate(LocalDate.of(2000, 12, 25));
			person.setChilds(1);
			person.setFirstName("Andy");
			person.setLastName("Warhol");

			Person person1 = new Person();
			person1.setBirthDate(LocalDate.of(2000, 12, 25));
			person1.setChilds(12);
			person1.setFirstName("David");
			person1.setLastName("Bowie");
			person1.setType(Sex.M);
			
			Persons persons = new Persons();
			persons.add(person);
			persons.add(person1);
			
			JAXBContext context = JAXBContext.newInstance(Persons.class);
			Marshaller marshaller = context.createMarshaller();
			
			marshaller.marshal(persons, System.out);
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(persons, new File("persons.xml"));
			
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
