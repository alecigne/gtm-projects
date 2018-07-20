package net.lecigne.polymorphisme.test;

import net.lecigne.polymorphisme.model.*;

/**
 * @author Anthony Le Cigne
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Poule poule1 = new Poule();
		Chat chat1 = new Chat();
		Felin felin1 = new Felin();
		Animal animal1 = new Animal();
		
		Animal[] animals = { poule1, chat1, felin1, animal1 };
		
		// For
		for(int i = 0; i < animals.length; i++) {
			animals[i].crier();
		}
		
		// Enhanced For
		for(Animal animal : animals) {
			animal.crier();
		}
		
		System.out.println(poule1.getClass());
	
	}

}