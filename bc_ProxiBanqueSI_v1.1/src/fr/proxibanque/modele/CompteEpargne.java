package fr.proxibanque.modele;

/**
 * Cette classe décrit les caractéristiques d'un compte épargne ProxiBanque.
 * Chaque client peut disposer d'un compte épargne après ajout explicite par un
 * conseiller. Aucune carte bancaire n'est associée à un compte épargne.
 * 
 * @author Anthony Le Cigne
 *
 */

public class CompteEpargne extends Compte {

	// *** ATTRIBUTS ***
	
	@SuppressWarnings("unused") 		// TODO Le taux n'est pas utilisé dans
	private final double TAUX = 3.0;	// ProxiBanqueSI v1.0
	

	// *** CONSTRUCTEURS ***
	
	public CompteEpargne(String numero, double solde, String dateOuverture) {
		super(numero, solde, dateOuverture);
	}
	
	// *** AUTRES METHODES ***
	
	@Override
	public String toString() {
		return // N° = 141951579, solde = 0.0, date ouv. = 2018-03-16
				super.toString();
	}
}
