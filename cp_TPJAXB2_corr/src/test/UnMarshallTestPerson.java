package test;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import model.Person;

public class UnMarshallTestPerson {

	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Person.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();

			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(new File("person.xsd"));
			unmarshaller.setSchema(schema);
			Person p = (Person) unmarshaller.unmarshal(new File("person.xml"));
			
			System.out.println(p);
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
