package fr.proxibanque.model;

/**
 * Cette classe abstraite factorise les caractéristiques d'un compte bancaire
 * Proxibanque (courant ou épargne).
 * 
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public abstract class Compte {

	// *** ATTRIBUTES ***
	
	private String numero;
	private double solde;
	private String dateOuverture;
	
	// *** CONSTRUCTORS ***
	
	public Compte(String numero, double solde, String dateOuverture) {
		this.numero = numero;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	// *** GETTERS and SETTERS ***
	
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// *** OTHER METHODS ***
	
	@Override
	public String toString() {
		return "N° = "
				+ this.numero
				+ ", solde = "
				+ this.solde
				+ ", date ouv. = "
				+ this.dateOuverture;
	}
	
}
