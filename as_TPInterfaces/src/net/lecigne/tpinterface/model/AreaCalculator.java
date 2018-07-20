package net.lecigne.tpinterface.model;

public class AreaCalculator {

	// On instancie jamais (sumArea -> méthode de classe)
	// = Classe utilitaire (< Java8)
	private AreaCalculator() {
	}
	
	public static double sumArea(Surface... surfaces) {
		double sum = 0.0;
		for (Surface surface : surfaces) {
			sum += surface.getArea(); 
		}
		return sum;
	}
	
}