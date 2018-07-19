package fr.proxibanque.model;

/**
 * Cette classe abstraite factorise les caractéristiques des employés
 * ProxiBanque (conseillers et gérants).
 * 
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public abstract class Employe {

	// *** ATTRIBUTES ***

	private String id;
	private String prenom;
	private String nom;

	// *** CONSTRUCTORS ***

	public Employe(String id, String prenom, String nom) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}

	// *** OTHER METHODS ***

	@Override
	public String toString() {
			
		return "ID employé : " + this.id + "\n"
				+ "Nom : " + this.nom + "\n"
				+ "Prénom : " + this.prenom + "\n";
	}
	
}
