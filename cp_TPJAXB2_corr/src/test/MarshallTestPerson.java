package test;

import java.io.File;
import java.time.LocalDate;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import model.Person;
import model.Person.Sex;

public class MarshallTestPerson {

	public static void main(String[] args) {
		try {
			Person person = new Person();
			person.setBirthDate(LocalDate.of(2000, 12, 25));
			person.setChilds(1);
			person.setFirstName("Andy");
			person.setLastName("Warhol");
			
			person.setType(Sex.M);
			
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(new File("person.xsd"));
			
			JAXBContext context = JAXBContext.newInstance(Person.class);
			Marshaller marshaller = context.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			marshaller.setSchema(schema);
			
			marshaller.marshal(person, System.out);
			marshaller.marshal(person, new File("person.xml"));
			
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
