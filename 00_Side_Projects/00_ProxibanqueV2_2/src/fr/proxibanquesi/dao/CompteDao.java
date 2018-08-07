package fr.proxibanquesi.dao;

import fr.proxibanquesi.model.*;

/**
 * Cette interface permet de réaliser les opérations du CRUD sur les comptes
 * courants et les comptes épargne
 * 
 * @author Anthony le Cigne et Jean-Michel Hiltbrunner
 *
 */
public interface CompteDao {

	// *** CREATION ***

	/**
	 * Permet de créer un objet de type Compte courant et de le persister dans la
	 * base de données
	 * 
	 * @param compteCourant
	 *            compte à ajouter à la base de données
	 */
	void creerCompteCourant(CompteCourant compteCourant);

	/**
	 * Permet de créer un compte épargne et de le persister dans la base de données
	 * 
	 * @param compteEpargne
	 *            Compte épargne à ajouter à la Base de données
	 */
	void creerCompteEpargne(CompteEpargne compteEpargne);

	// *** LECTURE ***

	/**
	 * Renvoie le compte courant détenu par un client présent dans la base de
	 * données
	 * 
	 * @param idClient
	 *            Identifiant unique du client dont on souhaite obtenir les comptes
	 * @return le compte courant détenu par le client
	 */
	CompteCourant obtenirCompteCourant(int idClient);

	/**
	 * Renvoie le compte épargne détenu par le client identifié par son numéro de
	 * client
	 * 
	 * @param idClient
	 *            Identifiant unique du client dont on souhaite récperer le compte
	 *            épargne
	 * @return le compte épargne détenu par le client
	 */
	CompteEpargne obtenirCompteEpargne(int idClient);

	// *** MODIFICATION ***

	/**
	 * Permet de modifier les caractéristiques d'un compte courant (en particulier
	 * le solde) connu à partir de son identifiant client
	 * 
	 * @param idClient
	 *            Identifiant unique du client dont on souhaite modifier les données
	 *            du compte
	 * @param compteCourant
	 *            Compte où l'on souhaite altérer les données
	 */
	void modifierCompteCourant(int idClient, CompteCourant compteCourant);

}
