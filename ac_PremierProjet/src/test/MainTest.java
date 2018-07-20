package test;

import model.Person;

public class MainTest {

	public static void main(String[] args) {

		// Person 1

		Person person1 = new Person();
		person1.setName("Bob");

		String name1 = person1.getName();
		System.out.println(name1);

		// Person 2

		Person person2 = new Person();
		person2.setName("Alice");

		String name2 = person2.getName();
		System.out.println(name2);

		// Person3

		Person person3 = new Person();
		person3.setName("Jack");

		String name3 = person3.getName();
		System.out.println(name3);
	
	}

}
