package net.lecigne.clientservrestsql.service;

import java.util.List;

import javax.ws.rs.core.Response;

import net.lecigne.clientservrestsql.dao.ClientDao;
import net.lecigne.clientservrestsql.dao.ClientDaoImp;
import net.lecigne.clientservrestsql.model.Client;
import net.lecigne.clientservrestsql.model.Compte;

public class ClientServiceImp implements ClientService {

	ClientDao clientDao = new ClientDaoImp();
	CompteService compteService = new CompteServiceImp();

	// *** Gestion client ***

	@Override
	public Response creerClient(Client client) {
		if (client != null) {
			clientDao.creerClient(client);
		}
		return Response.ok(client).build();
	}

	@Override
	public Client obtenirClient(long idClient) {
		return clientDao.obtenirClient(idClient);
	}

	@Override
	public List<Client> obtenirTousClients() {
		return clientDao.obtenirTousClients();
	}
	
	@Override
	public Response modifierClient(Client client) {
		clientDao.modifierClient(client);
		return Response.ok().build();
	}

	@Override
	public Response supprimerClient(long idClient) {
		clientDao.supprimerClient(idClient);
		return Response.ok().build();
	}

	// *** Opérations sur les clients ***

	@Override
	public Response associerCompte(long idClient) {
		Compte compte = compteService.creerCompte(1000.0);
		Client client = clientDao.obtenirClient(idClient);
		client.setCompte(compte);
		clientDao.modifierClient(client);
		return Response.ok().build();
	}

}
