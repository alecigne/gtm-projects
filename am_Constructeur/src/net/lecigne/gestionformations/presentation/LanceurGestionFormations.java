package net.lecigne.gestionformations.presentation;

import net.lecigne.gestionformations.domaine.Manager;

/**
 * @author Anthony Le Cigne
 *
 */

public class LanceurGestionFormations {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		// DONE 1) Déclaration
		Manager manager1;

		// DONE 2) Instanciation
		manager1 = new Manager("nom", "prenom", 0);

		// DONE 3) Utilisation
		manager1.setNom("Stallman");
		manager1.setPrenom("Richard");
		manager1.setId(1);

		System.out.println(manager1);

	}
}
