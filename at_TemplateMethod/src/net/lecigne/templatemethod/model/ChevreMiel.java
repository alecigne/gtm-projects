package net.lecigne.templatemethod.model;

public class ChevreMiel extends Pizza {

	public ChevreMiel(String name) {
		super(name);
	}
	
	@Override
	public void addTopping() {
		System.out.println("Ajout de miel...");
	}

	@Override
	public void addCheese() {
		System.out.println("Ajout de chèvre...");
		System.out.println("Ajout de gruyère...");
	}
	
}
