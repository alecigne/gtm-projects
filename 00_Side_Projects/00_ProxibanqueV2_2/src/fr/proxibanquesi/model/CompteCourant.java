package fr.proxibanquesi.model;

/**
 * Cette classe décrit les caractéristiques d'un compte courant ProxiBanque.
 * Chaque client dispose d'un compte courant généré automatiquement à la
 * création client. Une carte bancaire peut être associée à un compte courant
 * par un conseiller ProxiBanque.
 * 
 * @author Jean-Michel Hiltbrunner, Anthony Le Cigne
 *
 */

public class CompteCourant extends Compte {

	// *** ATTRIBUTES ***

	public static final double DECOUVERT_MAX = -1000.0;

	// *** CONSTRUCTORS ***

	// TODO L'idClient est-il nécessaire ? À refactoriser
	public CompteCourant(int numeroCompte, double solde, String dateOuverture, int idClient) {
		// Le compte courant est créé sans carte bancaire par défaut
		super(numeroCompte, solde, dateOuverture, idClient);
	}

	// *** OTHER METHODS ***

}
