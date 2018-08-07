package fr.proxibanquesi.service;

import java.util.List;

import fr.proxibanquesi.model.*;

/**
 * Cette interface regroupe les services métiers de l'agence proxibanque. Elle
 * regroupe toutes les opérations bancaires classiques.
 * 
 * @author Anthony le Cigne et Jean-Michel Hiltbrunner
 *
 */
public interface PBService {

	// *** CLIENTS ***

	// Création

	/**
	 * Créé un client et le persiste dans la base de données Clients
	 * 
	 * @param client
	 *            Client à ajouter dans la base de données
	 */
	void creerClient(Client client);

	// Lecture

	/**
	 * Donner les caractéristiques du client à partir de sont identifiant
	 * 
	 * @param idClient
	 *            Identifiant uniuqye du client
	 * @return Client identifié par son uméro
	 */
	Client obtenirClient(int idClient);

	/**
	 * Donne l'ensemble des clients de l'agence Proxibanque présent dans la base de
	 * données clients
	 * 
	 * @return ArrayList de l'ensemble des clients
	 */
	List<Client> obtenirListeClients();

	// Modification

	/**
	 * Permet de modifier les caractéristiques d'un client présent dans la base de
	 * données
	 * 
	 * @param idClient
	 *            Identifiant unique du client
	 * @param client
	 *            Client associé à son identifiant
	 */
	void modifierClient(int idClient, Client client);

	// Supression

	/**
	 * Supprime un client, ses comptes et cartes des bases de données Proxibanque
	 * 
	 * @param idClient
	 *            Identifiant unique du client à supprimer
	 */
	void supprimerClient(int idClient);

	// *** COMPTES ***

	// Ajout de comptes

	/**
	 * Ajout d'un compte courant à un client présent dans l'agence
	 * 
	 * @param idClient
	 *            Identifiant unique du client
	 */
	void associerCompteCourant(int idClient);

	/**
	 * Ajout d'un compte épargne à un client présent dans l'agence
	 * 
	 * @param idClient
	 *            Identifiant unique du client
	 */
	void associerCompteEpargne(int idClient);

	// Obtentions de comptes

	/**
	 * Récupérer le compte courant détenu par un client identifié dans l'agence
	 * 
	 * @param idClient
	 *            Identifiant unique du client
	 * @return Compte courant associé au client
	 */
	CompteCourant obtenirCompteCourant(int idClient);

	/**
	 * Récupérer le compte épargne détenu par le client identifié dans l'agence
	 * 
	 * @param idClient
	 *            Identifiant unique du client
	 * @return Compte épargne associé
	 */
	CompteEpargne obtenirCompteEpargne(int idClient);

	// *** OPERATIONS ***

	/**
	 * Permet de simuler un crédit à la consommation connaissant la durée et le
	 * montant souhaité par le client. Le taux est à la discrétion du conseiller.
	 * Source : https://www.ilemaths.net/calcul-credit.php
	 * 
	 * @param montant
	 *            Somme souhaitée par le client
	 * @param dureeMois
	 *            Durée espérée du crédit
	 * @param taux
	 *            Taux d'intéret du crédit (compris entre 0 et 100)
	 * @return Mensualité du crédit
	 */
	public double simulerCredit(double montant, int dureeMois, double taux);

	/**
	 * Cette méthode permet de réaliser un virement d'argent entre deux comptes
	 * bancaires. Le virement est possible si le solde résultant n'atteint pas le
	 * montant du découvert autorisé
	 * 
	 * @param idClientSrc
	 *            Identifiant unique du premier client dont on souhaite débiter le
	 *            compte
	 * @param idClientDest
	 *            Identifiant unique du second client dont on souhaite créditer le
	 *            compte
	 * @param montant
	 *            Somme d'argent transférée pendant le virement (décimales
	 *            autorisées)
	 */

	public void faireVirement(int idClientSrc, int idClientDest, double montant);

	// *** CONSEILLERS ***

	// Lecture

	/**
	 * Identifie un conseiller à partir de son login unique
	 * 
	 * @param login
	 *            Identifiant du conseiller
	 * @return Conseiller de l'agence
	 */
	Conseiller obtenirConseiller(String login);

}
