package net.lecigne.characters.model;

import net.lecigne.characters.behavior.*;

public class Warrior extends GameChar {

	// The warrior is heavy by default and can't run.
	public Warrior() {
		this.fightingStyle = new Gun();
	}

	public Warrior(Fight fightingStyle, Move movingStyle) {
		super(fightingStyle, movingStyle);
	}

}
