package fr.proxibanquesi.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import fr.proxibanquesi.dao.*;
import fr.proxibanquesi.model.Client;
import fr.proxibanquesi.model.Compte;

public class ClientServiceImp implements ClientService {

	private ClientDao clientDao = new ClientDaoImp();
	private CompteDao compteDao = new CompteDaoImp();

	// *** CREATION ***
	
	@Override
	public void creerClient(Client client) {
		if (client != null) {
			clientDao.creerClient(client);
		}
	}

	// *** LECTURE ***
	
	@Override
	public Client obtenirClient(int idClient) {
		return clientDao.obtenirClient(idClient);
	}

	@Override
	public List<Client> obtenirListeClients() {
		return clientDao.obtenirTousClients();
	}

	// *** MODIFICATION ***
	
	@Override
	public void modifierClient(int idClient) {
		clientDao.modifierClient(idClient);
	}
	
	// *** SUPPRESSION ***

	@Override
	public void supprimerClient(int idClient) {
		clientDao.supprimerClient(idClient);
	}

}
