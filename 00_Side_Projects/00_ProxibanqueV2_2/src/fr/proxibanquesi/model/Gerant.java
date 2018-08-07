package fr.proxibanquesi.model;

/**
 * Cette classe décrit les caractéristiques des gérants d'agence ProxiBanque.
 * 
 * @author Jean-Michel Hiltbrunner, Anthony Le Cigne
 *
 */

public class Gerant extends Employe {

	// *** CONSTRUCTORS ***
	
	public Gerant(String prenom, String nom, String login, String password) {
		super(prenom, nom, login, password);
	}

}