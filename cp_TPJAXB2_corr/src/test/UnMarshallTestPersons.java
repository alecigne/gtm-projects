package test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Persons;

public class UnMarshallTestPersons {

	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Persons.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Persons p = (Persons) unmarshaller.unmarshal(new File("persons.xml"));
			
			System.out.println(p);
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
