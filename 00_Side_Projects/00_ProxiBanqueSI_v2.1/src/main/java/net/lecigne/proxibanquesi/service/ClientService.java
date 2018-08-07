package net.lecigne.proxibanquesi.service;

import java.util.List;

import net.lecigne.proxibanquesi.model.Client;

public interface ClientService {

	void creerClient(Client client);

	Client obtenirClient(int idClient);

	List<Client> obtenirListeClients();
	
	List<Client> obtenirClientsConseiller(int idConseiller);

	void modifierClient(int idClient, Client client);

	void supprimerClient(int idClient);

}
