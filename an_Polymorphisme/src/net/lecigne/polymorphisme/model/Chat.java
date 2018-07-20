package net.lecigne.polymorphisme.model;

/**
 * @author Anthony Le Cigne
 *
 */

public class Chat extends Felin {

	@Override
	public void crier() {
		System.out.println("Miaou !");
	}
	
	public void ronronner() {
		System.out.println("Purring... DONE.");
	}
	
}
