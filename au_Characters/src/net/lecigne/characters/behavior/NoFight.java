package net.lecigne.characters.behavior;

/**
 * This class implements the pacifist style.
 * 
 * @author Anthony Le Cigne
 *
 */

public class NoFight implements Fight {

	@Override
	public void fight() {
		System.out.println("I refuse to fight.");
	}
	
}
