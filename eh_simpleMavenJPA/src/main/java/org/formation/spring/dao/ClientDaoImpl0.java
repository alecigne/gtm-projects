package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client;
import org.springframework.stereotype.Repository;

public class ClientDaoImpl0 implements IClientDao {

	@Override
	public void addClient(Client c) {
		System.out.println("dans ClientDaoImpl0.addClient --> client ajouté !");
	}

	@Override
	public List<Client> listClients() {
		System.out.println("dans ClientDaoImpl0.listClients() --> retourne la liste des clients");
		return null;
	}

	@Override
	public void deleteClient(int idClient) {
		System.out.println("dans ClientDaoImpl0.deleteClient --> client supprimé !");
	}

	@Override
	public Client editClient(int idClient) {
		System.out.println("dans ClientDaoImpl0.editClient --> retourne un client é editer");
		return null;
	}

	public void updateClient(Client c) {
		System.out.println("dans ClientDaoImpl0.updateClient --> client mis é jour !");
	}

	@Override
	public List<Client> chercherClients(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

}
