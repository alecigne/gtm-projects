package net.lecigne.angularclient.service;

import java.util.List;

import net.lecigne.angularclient.model.Client;

public interface AppService {
	
	void creerClient(Client client);
	
	Client obtenirClient(long idClient);
	
	List<Client> obtenirTousClients();
	
	void modifierClient(Client client);
	
	void supprimerClient(long idClient);
	
}
