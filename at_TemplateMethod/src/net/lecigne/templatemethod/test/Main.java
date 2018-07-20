package net.lecigne.templatemethod.test;

import net.lecigne.templatemethod.model.*;

public class Main {

	public static void main(String[] args) {
		
		ChevreMiel chevre1 = new ChevreMiel("Chèvre Miel");
		QuatreFromages quatre1 = new QuatreFromages("Quatre Fromages");
//		Regina regina1 = new Regina("Regina");
//		Saumonetta saumonetta1 = new Saumonetta("Saumonetta");

//		Pizza[] pizzas = { chevre1, quatre1, regina1, saumonetta1 };
		
//		for (Pizza pizza : pizzas) {
//			pizza.makePizza();
//		}
		
		chevre1.makePizza();
		
	}

}