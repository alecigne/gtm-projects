package fr.proxibanquesi.dao;

import java.util.List;
import fr.proxibanquesi.model.Client;

public interface ClientDao {

	// *** CREATION ***

	void creerClient(Client client);

	// *** LECTURE ***

	Client obtenirClient(int id);

	List<Client> obtenirTousClients();

	// *** MODIFICATION ***

	void modifierClient(int id);

	// *** SUPPRESSION ***

	/**
	 * Permet la suppression d'un client ProxiBanque dans la table des clients. La
	 * table SQL et sa contrainte ON DELETE CASCADE entraîne la suppression du
	 * compte associé.
	 * 
	 * @param id
	 */
	void supprimerClient(int id);

}
