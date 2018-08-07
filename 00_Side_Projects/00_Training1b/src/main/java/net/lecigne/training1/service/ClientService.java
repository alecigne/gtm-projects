package net.lecigne.training1.service;

import java.util.List;

import net.lecigne.training1.exceptions.ServiceException;
import net.lecigne.training1.model.Client;

public interface ClientService {

	void sauvegarderClient(Client client) throws ServiceException;

	void modifierClient(Client client);

	Client obtenirClient(long idClient);

	List<Client> obtenirTousClients();

	void supprimerClient(long idClient);
	
}
