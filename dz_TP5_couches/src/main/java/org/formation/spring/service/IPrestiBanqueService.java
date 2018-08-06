package org.formation.spring.service;

import java.util.List;

import org.formation.spring.model.Client;

public interface IPrestiBanqueService {

	void addClient(Client c);
	
	List<Client> listClients();
	
	void deleteClient(int idClient);
	
	Client editClient(int idClient);
	
	void updateClient(Client c);
	
	List<Client> chercherClients(String motCle);
	
}
