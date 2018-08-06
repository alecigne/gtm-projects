package net.lecigne.webuserssql.service;

import java.util.List;

import net.lecigne.webuserssql.dao.*;
import net.lecigne.webuserssql.model.Client;

/**
 * Cette classe implémente l'interface ClientService. Elle fournit les méthodes
 * permettant d'effectuer les opérations nécessaires à la gestion des clients
 * (création, lecture, modification, suppression).
 * 
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public class ClientServiceImp implements IClientService {

	private ClientDao dao = new ClientDaoImp();

	@Override
	public void creerClient(Client client) {
		if (client != null) {
			dao.creerClient(client);
		}
	}

	@Override
	public Client obtenirClient(int id) {
		return dao.obtenirClient(id);
	}

	@Override
	public List<Client> obtenirListeClients() {
		return dao.obtenirTousClients();
	}

	@Override
	public void modifierClient(int id) {
		dao.modifierClient(id);
	}

	@Override
	public void supprimerClient(int id) {
		dao.supprimerClient(id);
	}

}
