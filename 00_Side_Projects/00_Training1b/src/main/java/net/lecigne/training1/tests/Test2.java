package net.lecigne.training1.tests;

import net.lecigne.training1.dao.ManualClientDao;
import net.lecigne.training1.dao.SQLClientDao;
import net.lecigne.training1.model.Client;
import net.lecigne.training1.service.ClientService;
import net.lecigne.training1.service.ClientServiceImp;

public class Test2 {

	public static void main(String[] args) {

		ManualClientDao clientDao = new SQLClientDao();

		Client client1 = new Client("Dupont", "Michel");
		Client client2 = new Client("Dupont", "Camille");
		Client client3 = new Client("Durand", "Jean");

		// clientDao.sauvegarder(client1);
		// clientDao.sauvegarder(client2);
		// clientDao.sauvegarder(client3);

		for (Client client : clientDao.obtenirTous()) {
			System.out.println(client);
		}

		Client clientModif = clientDao.obtenir(4L);
		clientModif.setLogin("mdupont");
		clientDao.modifier(clientModif);

	}

}
