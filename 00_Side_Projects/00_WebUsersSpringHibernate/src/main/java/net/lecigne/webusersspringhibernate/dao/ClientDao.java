package net.lecigne.webusersspringhibernate.dao;

import java.util.List;

import net.lecigne.webusersspringhibernate.model.Client;

public interface ClientDao {

	void addClient(Client client);

	Client getClient(long idClient);

	List<Client> getAllClients();
		
	void updateClient(Client client);

	void deleteClient(long idClient);


}
