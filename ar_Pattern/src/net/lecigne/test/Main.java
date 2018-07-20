package net.lecigne.test;

import net.lecigne.model.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("=== Bienvenue dans Super Mario Bros - Java Edition ===");
		
		MoveCharacterStrategy def = new DefaultMoveStrategy();
		MoveCharacterStrategy climb = new ClimbMoveStrategy();
		MoveCharacterStrategy run = new RunMoveStrategy();
		MoveCharacterStrategy crawl = new CrawlMoveStrategy();
		MoveCharacterStrategy jump = new JumpMoveStrategy();
		
		Mario mario1 = new Mario(def);
		
		System.out.println("Mario rencontre un mur...");
		mario1.changeStrategy(climb);
		mario1.move();
		
		System.out.println("Mario prend peur - quel teubé !!!");
		mario1.changeStrategy(run);
		mario1.move();
		
		System.out.println("Un obstacle !");
		mario1.changeStrategy(jump);
		mario1.move();
		
		System.out.println("Un petit tunnel permet de passer au niveau suivant.");
		mario1.changeStrategy(crawl);
		mario1.move();
		
	}

}