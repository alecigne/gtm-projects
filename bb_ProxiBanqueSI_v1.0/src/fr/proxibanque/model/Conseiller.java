package fr.proxibanque.model;

import java.util.ArrayList;

/**
 * Cette classe décrit les caractéristiques des conseillers ProxiBanque.
 * 
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public class Conseiller extends Employe {

	// *** ATTRIBUTES ***
	
	private ArrayList<String> listeClients = new ArrayList<>();

	// *** CONSTRUCTORS ***
	
	public Conseiller(String id, String prenom, String nom) {
		super(id, prenom, nom);
	}

	// *** GETTERS and SETTERS ***
	
	public ArrayList<String> getListeClients() {
		return listeClients;
	}

	// *** OTHER METHODS ***
	
	@Override
	public String toString() {
		String finalStr = "Clients associés %s: %s";
		String idStr = new String(); // liste d'ID clients
		int nbClients = this.listeClients.size();
		
		if (nbClients > 0) {
			for (String id : this.listeClients) {
				idStr += id + " "; // on peuple la chaîne de caractères d'ID clients
			}
			finalStr = String.format(finalStr, ("(" + nbClients + ") "), idStr);
		} else {
			finalStr = String.format(finalStr, "", "pas de clients.");
		}
						
		return super.toString() // Exemple : ID, \n, Nom, \n, Prénom, \n
				+ finalStr;
	}
	
}