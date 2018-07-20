package fr.proxibanque.modele;

/**
 * Cette classe abstraite factorise les caractéristiques d'un compte bancaire
 * Proxibanque (courant ou épargne).
 * 
 * @author Anthony Le Cigne
 *
 */

public abstract class Compte {

	// *** ATTRIBUTS ***

	private String numero;
	private double solde;
	private String dateOuverture;

	// *** CONSTRUCTEURS ***

	public Compte(String numero, double solde, String dateOuverture) {
		this.numero = numero;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	// *** ACCESSEURS et MUTATEURS ***

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// *** AUTRES METHODES ***

	@Override
	public String toString() {
		return "N° = " + this.numero + ", solde = " + this.solde
				+ ", date ouv. = " + this.dateOuverture;
	}

}
