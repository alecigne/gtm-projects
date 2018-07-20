package net.lecigne.butterflies.model;

/**
 * This class (a POJO) describes a butterfly object, characterized by a species
 * and a color.
 * 
 * @author Anthony Le Cigne
 * @version 0.0.1
 */

public class Butterfly {

	private String species;
	private String color;
	
	public Butterfly(String species, String color) {
		this.species = species;
		this.color = color;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "a "
				+ this.color.toUpperCase()
				+ " butterfly from the " 
				+ this.species.toUpperCase()
				+ " species";
	}
		
}
