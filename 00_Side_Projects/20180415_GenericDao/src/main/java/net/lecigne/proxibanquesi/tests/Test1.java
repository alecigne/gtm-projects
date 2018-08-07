package net.lecigne.proxibanquesi.tests;

import net.lecigne.proxibanquesi.dao.CRUD;
import net.lecigne.proxibanquesi.dao.CRUDImp;
import net.lecigne.proxibanquesi.model.Client;

public class Test1 {

	public static void main(String[] args) {

		CRUD<Client> crud = new CRUDImp<>();

		Client client = new Client("Dupont", "Michel", "1 rue de la Source", "75000", "Paris",
				"0100000001");
		
		crud.creer(client);

	}

}
