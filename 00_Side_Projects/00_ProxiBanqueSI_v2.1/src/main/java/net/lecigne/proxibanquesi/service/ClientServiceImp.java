package net.lecigne.proxibanquesi.service;

import java.util.List;

import net.lecigne.proxibanquesi.dao.ClientDao;
import net.lecigne.proxibanquesi.dao.ClientDaoImp;
import net.lecigne.proxibanquesi.model.Client;

public class ClientServiceImp implements ClientService {

	ClientDao clientDao = new ClientDaoImp();

	@Override
	public void creerClient(Client client) {
		if (client != null) {
			clientDao.creerClient(client);
		}
	}

	@Override
	public Client obtenirClient(int idClient) {
		return clientDao.obtenirClient(idClient);
	}

	@Override
	public List<Client> obtenirListeClients() {
		return clientDao.obtenirTousClients();
	}

	@Override
	public List<Client> obtenirClientsConseiller(int idConseiller) {
		return clientDao.obtenirClientsConseiller(idConseiller);
	}
	
	@Override
	public void modifierClient(int idClient, Client client) {
		clientDao.modifierClient(idClient, client);
	}

	@Override
	public void supprimerClient(int idClient) {
		clientDao.supprimerClient(idClient);
	}

}
