package net.lecigne.polymorphisme.model;

/**
 * @author Anthony Le Cigne
 *
 */

public class Poule extends Animal {

	@Override
	public void crier() {
		System.out.println("Cot cot codec.");
	}

	public void picorer() {
		System.out.println("Je picore du grain.");
	}
	
}
