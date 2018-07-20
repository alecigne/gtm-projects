package net.lecigne.constructeur.test;

import net.lecigne.constructeur.model.Person;

public class Test2 {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(Person.getNbInstances());
		
	}

}