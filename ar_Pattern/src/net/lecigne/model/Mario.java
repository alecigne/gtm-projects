package net.lecigne.model;

public class Mario {
	
	private MoveCharacterStrategy strategy;
	
	public Mario(MoveCharacterStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void changeStrategy(MoveCharacterStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void move() {
		strategy.execute();
	}
	
}