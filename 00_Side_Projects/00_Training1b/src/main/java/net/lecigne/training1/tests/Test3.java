package net.lecigne.training1.tests;

import net.lecigne.training1.exceptions.ServiceException;
import net.lecigne.training1.model.Client;
import net.lecigne.training1.service.ClientService;
import net.lecigne.training1.service.ClientServiceImp;

public class Test3 {

	public static void main(String[] args) {

		ClientService s = new ClientServiceImp();

		Client client1 = new Client("Dupont", "Michel");
		Client client2 = new Client("Dupont", "Camille");
		Client client3 = new Client("Durand", "Jean");

		try {
			s.sauvegarderClient(client1);
			s.sauvegarderClient(client2);
			s.sauvegarderClient(client3);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		System.out.println(s.obtenirClient(17L));

		for (Client client : s.obtenirTousClients()) {
			System.out.println(client);
		}

		Client clientModif = s.obtenirClient(17L);
		clientModif.setPassword("1234");
		s.modifierClient(clientModif);
		
//		s.supprimerClient(15L);

	}

}
