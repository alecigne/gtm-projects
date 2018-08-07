package net.lecigne.training1.tests;

import net.lecigne.training1.dao.ManualClientDao;
import net.lecigne.training1.dao.MemClientDao;
import net.lecigne.training1.model.Client;

public class Test1 {

	public static void main(String[] args) {

		ManualClientDao clientDao = new MemClientDao();

		Client client1 = new Client("Dupont", "Michel");
		Client client2 = new Client("Dupont", "Camille");
		Client client3 = new Client("Durand", "Jean");

		clientDao.sauvegarder(client1);
		clientDao.sauvegarder(client2);
		clientDao.sauvegarder(client3);

		System.out.println("=== Affichage des clients ===");

		for (Client client : clientDao.obtenirTous()) {
			System.out.print(client + "\n");
		}

		System.out.println("=== Affichage du client 0 ===");

		System.out.println(clientDao.obtenir(0L));

		System.out.println("=== Suppression du client 2 ===");

		clientDao.supprimer(2L);

		for (Client client : clientDao.obtenirTous()) {
			System.out.print(client + "\n");
		}

		System.out.println("=== On remet le client dans la database ===");

		clientDao.sauvegarder(client3);

		for (Client client : clientDao.obtenirTous()) {
			System.out.print(client + "\n");
		}

	}

}
