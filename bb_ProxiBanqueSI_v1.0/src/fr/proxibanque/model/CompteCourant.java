package fr.proxibanque.model;

/**
 * Cette classe décrit les caractéristiques d'un compte courant ProxiBanque.
 * Chaque client dispose d'un compte courant généré automatiquement à la
 * création client. Une carte bancaire peut être associée à un compte courant
 * par un conseiller ProxiBanque.
 * 
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public class CompteCourant extends Compte {

	// *** ATTRIBUTES ***
	
	private CarteVisa carte;
	public static final double DECOUVERT_MAX = -1000.0;

	// *** CONSTRUCTORS ***
	
	public CompteCourant(String numero, double solde, String dateOuverture) {
		// Le compte courant est créé sans carte bancaire par défaut
		super(numero, solde, dateOuverture);
	}

	// *** GETTERS and SETTERS ***
	
	public void setCarte(CarteVisa carte) {
		this.carte = carte;
	}

	// *** OTHER METHODS ***
	
	@Override
	public String toString() {
		String strCarte = new String();

		// chaîne de caractère par défaut si pas de carte associée au compte courant
		if (this.carte != null) {
			strCarte = this.carte.toString();
		} else {
			strCarte = "pas de carte associée au compte";
		}

		return super.toString() // exemple : N° = 141951579, solde = 0.0, date ouv. = 2018-03-16
				+ "\n" + "=> Carte du compte courant : " + strCarte;
	}

}
