package net.lecigne.constructeur.test;

import java.util.*;

import net.lecigne.constructeur.model.*;

/**
 * Classe de démarrage de l'application.
 * 
 * @author Anthony Le Cigne
 * @version 0.1
 *
 */

public class Main {

	/**
	 * La méthode main est statique, elle est chargée en mémoire au démarrage de
	 * l'application et peut donc être utilisée avant la création de tout objet.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Person p1 = new Person("Richard", "Stallman");
		Person p2 = new Person("Linus", "Torvalds");
		Employee p3 = new Employee("Alan", "Cox", "Unixer", 5_000);
		Employee p4 = new Employee("Guy", "Steele", "Lisper", 10_000);

		LinkedList<Person> persons = new LinkedList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);

		// *** FOR ***

		System.out.println("=== FOR ===");

		for (int x = 0; x < persons.size(); x++) {
			System.out.println(persons.get(x));
		}

		System.out.println();
		
		// *** FOR-EACH ***

		System.out.println("=== FOR-EACH ===");

		for (Person person : persons) {
			System.out.println(person);
		}
		
		System.out.println();

		// *** ITERATOR ***

		System.out.println("=== ITERATOR ===");

		ListIterator li = persons.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println();

	}

}
