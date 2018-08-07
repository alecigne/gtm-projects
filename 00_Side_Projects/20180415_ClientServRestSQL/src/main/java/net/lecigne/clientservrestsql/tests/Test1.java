package net.lecigne.clientservrestsql.tests;

import net.lecigne.clientservrestsql.dao.ClientDao;
import net.lecigne.clientservrestsql.dao.ClientDaoImp;
import net.lecigne.clientservrestsql.model.Client;

public class Test1 {

	public static void main(String[] args) {

		ClientDao clientDao = new ClientDaoImp();

		Client c1 = new Client("Durand", "Marie", "1 rue de la Source", "75001", "Paris",
				"0100000001");
		
		Client c2 = new Client("Durand", "Jacques", "1 rue de la Source", "75001", "Paris",
				"0100000001");
		
		clientDao.creerClient(c1);
		clientDao.creerClient(c2);

	}

}
