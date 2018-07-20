package net.lecigne.characters.model;

import net.lecigne.characters.behavior.*;

/**
 * This class abstract a character. Every character has a fighting style and a
 * moving style, by default: NoFight, and Walk. Every character can then be
 * instantiated with a moving and fighting style and importantly, their style
 * can be modified.
 * 
 * @author Anthony Le Cigne
 *
 */

public abstract class GameChar {

	protected Fight fightingStyle = new NoFight();
	protected Move movingStyle = new Walk();

	// *** CONSTRUCTORS ***

	public GameChar() {
	}

	public GameChar(Fight fightStyle, Move movingStyle) {
		this.fightingStyle = fightStyle;
		this.movingStyle = movingStyle;
	}

	// *** SETTERS ***

	public void setFightingStyle(Fight fightingStyle) {
		this.fightingStyle = fightingStyle;
	}

	public void setMovingStyle(Move movingStyle) {
		this.movingStyle = movingStyle;
	}

	// *** OTHER METHODS ***

	public void move() {
		movingStyle.move();
	}

	public void fight() {
		fightingStyle.fight();
	}

}
