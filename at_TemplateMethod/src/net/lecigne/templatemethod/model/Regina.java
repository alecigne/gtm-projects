package net.lecigne.templatemethod.model;

public class Regina extends Pizza {

	public Regina(String name) {
		super(name);
	}

	@Override
	public void addTopping() {
		System.out.println("Ajout de champignons...");
		System.out.println("Ajout de dés de jambons...");
		System.out.println("Ajout d'olives...");
	}

	@Override
	public void addCheese() {
		System.out.println("Ajout de gruyère râpé...");
	}
	
}
