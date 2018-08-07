package fr.proxibanquesi.dao;

import java.util.List;
import fr.proxibanquesi.model.Client;

/**
 * Cette interface permet de réalser les opérations du CRUD Coté client
 * 
 * @author Anthony le Cigne et Jean-Michel Hiltbrunner
 *
 */
public interface ClientDao {

	// *** CREATION ***

	/**
	 * Créer un client à partir du constructeur Client et le persister dans la Base
	 * de données
	 * 
	 * @param client
	 *            Client à ajouter dans la base de données
	 */
	void creerClient(Client client);

	// *** LECTURE ***

	/**
	 * Obtenir les informations du Client reconnu à partir de son identifiant unique
	 * 
	 * @param idClient
	 *            Identifiant unique du client
	 * @return le Client identifié dans la base de données
	 */
	Client obtenirClient(int idClient);

	/**
	 * Permet d'obtenir la liste de tous les clients de l'agence Proxibanque
	 * 
	 * @return ArrayList de tous les clients
	 */
	List<Client> obtenirTousClients();

	// *** MODIFICATION ***

	/**
	 * Réalise la modification des données basiques du client (nom, prénom... à
	 * partir du formulaire web)
	 * 
	 * @param idClient
	 *            Identifiant unique du client à modifier
	 * @param client
	 *            le Client identifié dans la base de données
	 */
	void modifierClient(int idClient, Client client);

	// *** SUPPRESSION ***

	/**
	 * Supprime un client de la base de données, sa suppression entraine par cascade
	 * la suppression de ses comptes et de ses cartes associées.
	 * Cette suppression par cascade, dans cette version, est gérée par la base SQL.
	 * 
	 * @param idClient
	 *            Identifiant unique du client à supprimer
	 */
	void supprimerClient(int idClient);

}
