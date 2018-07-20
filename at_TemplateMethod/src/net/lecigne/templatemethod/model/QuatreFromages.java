package net.lecigne.templatemethod.model;

public class QuatreFromages extends Pizza {

	public QuatreFromages(String name) {
		super(name);
	}
	
	@Override
	public void addTopping() {
	}

	@Override
	public void addCheese() {
		System.out.println("Ajout de mozzarella...");
		System.out.println("Ajout de mimolette...");
		System.out.println("Ajout de fromage de chèvre...");
		System.out.println("Ajout de Gorgonzola...");
	}

}