package net.lecigne.clientservrestsql.tests;

import net.lecigne.clientservrestsql.dao.ClientDao;
import net.lecigne.clientservrestsql.dao.ClientDaoImp;
import net.lecigne.clientservrestsql.model.Client;
import net.lecigne.clientservrestsql.model.Compte;
import net.lecigne.clientservrestsql.service.CompteService;
import net.lecigne.clientservrestsql.service.CompteServiceImp;

public class Test3 {

	public static void main(String[] args) {
		
		ClientDao clientDao = new ClientDaoImp();
		CompteService compteService = new CompteServiceImp();
		
		Client client = new Client("Durand", "Marie", "1 rue de la Source", "75001", "Paris", "0100000001");
		Compte compte = compteService.creerCompte(1000.0);


		clientDao.creerClient(client);

	}

}
