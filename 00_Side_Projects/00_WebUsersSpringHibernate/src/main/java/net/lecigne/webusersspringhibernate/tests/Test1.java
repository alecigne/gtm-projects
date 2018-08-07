package net.lecigne.webusersspringhibernate.tests;

import net.lecigne.webusersspringhibernate.dao.ClientDao;
import net.lecigne.webusersspringhibernate.dao.MemClientDao;
import net.lecigne.webusersspringhibernate.model.Adresse;
import net.lecigne.webusersspringhibernate.model.Client;

public class Test1 {

	public static void main(String[] args) {

		ClientDao clientDao = new MemClientDao();

		Adresse adresse1 = new Adresse(2, "rue de la Source", "92120", "Montrouge");
		Client client1 = new Client("Dupont", "Michel", adresse1, "mdupont", "1234");
		Client client2 = new Client("Durand", "Michel", adresse1, "mdupont", "1234");
		
		clientDao.addClient(client1);
		client1.setNom("Connard");
		
		for (Client client : clientDao.getAllClients()) {
			System.out.println(client);
		}
		
	}

}
