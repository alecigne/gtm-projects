package net.lecigne.webusers.service;

import java.util.ArrayList;
import java.util.List;

import net.lecigne.webusers.dao.ClientDAO;
import net.lecigne.webusers.dao.MemClientDAO;
import net.lecigne.webusers.model.Client;

/**
 * Cette classe implémente l'interface ConseillerService. Elle fournit les
 * méthodes permettant aux conseillers d'effectuer les opérations nécessaires à
 * l'activité de ProxiBanque (gestion des clients, des comptes, des cartes, et
 * opérations diverses).
 * 
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public class ServiceImp implements Service {

	private ClientDAO dao = new MemClientDAO();

	@Override
	public void creerClient(Client c) {
		if (c != null) {
			dao.sauvegarder(c);
		}
	}

	@Override
	public void modifierClient(String id, Client c) {
		dao.modifier(id, c);
	}

	@Override
	public Client obtenirClient(String id) {
		return dao.obtenir(id);
	}

	@Override
	public void supprimerClient(String id) {
		dao.supprimer(id);
	}

	@Override
	public List<Client> obtenirListeClients() {
		return dao.obtenirTous();
	}

}
