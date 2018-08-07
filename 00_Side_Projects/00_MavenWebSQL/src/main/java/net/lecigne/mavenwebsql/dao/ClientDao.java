package net.lecigne.mavenwebsql.dao;

import java.util.List;

import net.lecigne.mavenwebsql.model.Client;

public interface ClientDao {

	// *** CREATION ***

	void creerClient(Client client);

	// *** LECTURE ***

	Client obtenirClient(int idClient);

	List<Client> obtenirTousClients();

	// *** MODIFICATION ***

	void modifierClient(int idClient, Client client);

	// *** SUPPRESSION ***

	void supprimerClient(int idClient);

}
