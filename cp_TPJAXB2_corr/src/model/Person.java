package model;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import adapter.MyDateAdapter;

@XmlType(propOrder={"firstName", "lastName", "childs", "birthDate"})
@XmlRootElement(name="person")
public class Person {

	public enum Sex{M,F}
	
	Sex type;
	String firstName;
	String lastName;
	LocalDate birthDate;
	int childs;
	
	
	@XmlElement( name ="firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@XmlElement(name="birthDate")
	@XmlJavaTypeAdapter(MyDateAdapter.class)
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	@XmlElement(name="childs")
	public void setChilds(int childs) {
		this.childs = childs;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public int getChilds() {
		return childs;
	}
	
	
	public Sex getType() {
		return type;
	}
	@XmlAttribute(name="sex")
	public void setType(Sex type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", childs="
				+ childs + "]"
		//		;
		+" type="+type;
	}
	
	
}
