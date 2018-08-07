package net.lecigne.mavenwebsql.service;

import net.lecigne.mavenwebsql.dao.ClientDao;
import net.lecigne.mavenwebsql.dao.ClientDaoImp;
import net.lecigne.mavenwebsql.model.Client;

public class ServiceImp implements Service {

	ClientDao clientDao = new ClientDaoImp(); 
	
	@Override
	public void creerClient(Client client) {
		clientDao.creerClient(client);
	}

}
