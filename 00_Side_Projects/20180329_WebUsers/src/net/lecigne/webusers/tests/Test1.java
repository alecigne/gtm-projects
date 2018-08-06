package net.lecigne.webusers.tests;

import net.lecigne.webusers.model.Client;
import net.lecigne.webusers.service.*;

public class Test1 {

	public static void main(String[] args) {

		Service s = new ServiceImp();

		Client client1 = new Client("Dupond", "Michel", "9 rue du Sapin", "75000", "Paris",
				"0100000001");
		Client client2 = new Client("Durand", "Roger", "12 rue de la Source", "92120", "Montrouge",
				"0100000002");
		Client client3 = new Client("Le Goff", "Marcel", "7 avenue Pompidou", "29200", "Brest",
				"0200000003");

		s.creerClient(client1);
		s.creerClient(client2);
		s.creerClient(client3);
		System.out.println(s.obtenirListeClients());

	}

}
