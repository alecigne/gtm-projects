package net.lecigne.model;

public class DefaultMoveStrategy implements MoveCharacterStrategy {
	
	@Override
	public void execute() {
		System.out.println("Marcher");
	}

}
