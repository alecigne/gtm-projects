package fr.proxibanquesi.model;


/**
 * Cette classe décrit les caractéristiques des conseillers ProxiBanque.
 * 
 * @author Jean-Michel Hiltbrunner, Anthony Le Cigne
 *
 */

public class Conseiller extends Employe {

	public Conseiller(String prenom, String nom, String login, String password) {
		super(prenom, nom, login, password);
	}
	
}