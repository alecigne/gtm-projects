package fr.proxibanquesi.tests;

import fr.proxibanquesi.dao.ClientDao;
import fr.proxibanquesi.dao.ClientDaoImp;
import fr.proxibanquesi.dao.CompteDao;
import fr.proxibanquesi.dao.CompteDaoImp;

public class Tests {

	public static void main(String[] args) {

		ClientDao clientDao = new ClientDaoImp();
		
		clientDao.supprimerClient(2);
		
	}

}
