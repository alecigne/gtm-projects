package net.lecigne.characters.behavior;

/**
 * Walking moving style. 
 * @author Anthony Le Cigne
 *
 */

public class Walk implements Move {

	@Override
	public void move() {
		System.out.println("I move by walking.");
	}

}
