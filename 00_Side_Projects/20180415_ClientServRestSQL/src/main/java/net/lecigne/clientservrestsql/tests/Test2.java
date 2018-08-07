package net.lecigne.clientservrestsql.tests;

import net.lecigne.clientservrestsql.dao.ClientDao;
import net.lecigne.clientservrestsql.dao.ClientDaoImp;
import net.lecigne.clientservrestsql.model.Client;
import net.lecigne.clientservrestsql.model.Compte;

public class Test2 {

	public static void main(String[] args) {

		ClientDao clientDao = new ClientDaoImp();

		Client client1 = new Client("Durand", "Marie", "1 rue de la Source", "75001", "Paris",
				"0100000001");
		
		Compte compte1 = new Compte("12345678", 1000.0, "2018-04-15");
		
		clientDao.creerClient(client1);
		
		client1.setCompte(compte1);

	}

}
