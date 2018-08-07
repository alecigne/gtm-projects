package fr.proxibanquesi.tests;

import fr.proxibanquesi.dao.ClientDao;
import fr.proxibanquesi.dao.ClientDaoImp;
import fr.proxibanquesi.model.Client;

/**
 * Permet d'ajouter 3 clients basiques pour les opérations de test
 * @author Anthony le Cigne et Jean-Mchel Hiltbrunner
 *
 */
public class DummyClients {

	public static void main(String[] args) {
		ClientDao clientDao = new ClientDaoImp();

		Client c1 = new Client("Dupont", "Michel", "1 rue Molière", "75001", "Paris", "0100000001");
		Client c2 = new Client("Durand", "Jean", "2 rue Racine", "75002", "Paris", "0100000002");
		Client c3 = new Client("Martin", "Michel", "3 rue Corneille", "75003", "Paris", "0100000003");

		clientDao.creerClient(c1);
		clientDao.creerClient(c2);
		clientDao.creerClient(c3);
	}

}
