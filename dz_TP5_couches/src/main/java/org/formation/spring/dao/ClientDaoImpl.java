package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client;
import org.springframework.stereotype.Repository;

@Repository("clientDao")
public class ClientDaoImpl implements IClientDao {

	@Override
	public void addClient(Client c) {
		System.out.println("dans ClientDaoImpl.addClient --> client ajouté !");
	}

	@Override
	public List<Client> listClients() {
		System.out.println("dans ClientDaoImpl.listClients --> liste de clients obtenu !");
		return null;
	}

	@Override
	public void deleteClient(int idClient) {
		System.out.println("dans ClientDaoImpl.deleteClient --> client supprimé !");
	}

	@Override
	public Client editClient(int idClient) {
		System.out.println("dans ClientDaoImpl.editClient --> client trouvé !");
		return null;
	}

	@Override
	public void updateClient(Client c) {
		System.out.println("dans ClientDaoImpl.updateClient --> client updaté !");
	}

	@Override
	public List<Client> chercherClients(String motCle) {
		System.out.println("dans ClientDaoImpl.chercherClients --> clients trouvés !");
		return null;
	}

}
