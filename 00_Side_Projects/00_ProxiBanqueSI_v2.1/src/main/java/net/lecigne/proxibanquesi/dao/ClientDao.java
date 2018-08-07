package net.lecigne.proxibanquesi.dao;

import java.util.List;

import net.lecigne.proxibanquesi.model.Client;

public interface ClientDao {

	void creerClient(Client client);

	Client obtenirClient(int idClient);

	List<Client> obtenirTousClients();
	
	List<Client> obtenirClientsConseiller(int idConseiller);

	void modifierClient(int idClient, Client client);

	void supprimerClient(int idClient);

}
