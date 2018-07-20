package net.lecigne.templatemethod.model;

public class Saumonetta extends Pizza {

	public Saumonetta(String name) {
		super(name);
	}

	@Override
	public void addTopping() {
		System.out.println("Ajout de saumon...");
	}

	@Override
	public void addCheese() {
		System.out.println("Ajout de gruyère...");
	}

}
