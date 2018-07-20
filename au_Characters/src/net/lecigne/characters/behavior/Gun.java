package net.lecigne.characters.behavior;

/**
 * This class implements the gun-fighting style.
 * 
 * @author Anthony Le Cigne
 *
 */

public class Gun implements Fight {

	@Override
	public void fight() {
		System.out.println("I usually use a gun. Beware...");
	}

}
