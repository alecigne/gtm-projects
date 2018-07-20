package net.lecigne.characters.test;

import net.lecigne.characters.model.*;
import net.lecigne.characters.behavior.*;

/**
 * @author Anthony Le Cigne
 * @version 0.0.1
 *
 */

public class Game {

	public static void main(String[] args) {
		
		System.out.println("=== You chose the warrior. ===\n");
		GameChar warrior = new Warrior();
		warrior.move();
		warrior.fight();
		
		System.out.println("\n== The warrior is sick of violence... ==\n");
		warrior.setFightingStyle(new NoFight());
		warrior.fight();
		
		System.out.println("\n== You chose the priest. ===\n");
		GameChar priest = new Priest();
		priest.move();
		priest.fight();
		
		System.out.println("\n== The priest now becomes angry... ===\n");
		priest.setFightingStyle(new Gun());
		priest.fight();
		
		System.out.println("\n== He deeply regrets his actions and runs away from God... ==\n");
		priest.setMovingStyle(new Run());
		priest.move();
	}

}
