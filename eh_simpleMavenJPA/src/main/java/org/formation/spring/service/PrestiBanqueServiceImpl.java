package org.formation.spring.service;

import java.util.List;

import org.formation.spring.dao.IClientDao;
import org.formation.spring.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

//@Service("service")
public class PrestiBanqueServiceImpl implements IPrestiBanqueService {
	private static final Logger LOGGER =  LoggerFactory.getLogger(PrestiBanqueServiceImpl.class);

//	@Resource(name="daoHibernate")
	//@Resource(name="dao")
	private IClientDao clientDao;

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public void addClient(Client c) {
		clientDao.addClient(c);

	}

	@Override
	public List<Client> listClients() {
		LOGGER.debug("lister clients");
		LOGGER.info("information");

		return clientDao.listClients();
	}

	@Override
	public void deleteClient(int idClient) {
		clientDao.deleteClient(idClient);

	}

	@Override
	public Client editClient(int idClient) {
		return clientDao.editClient(idClient);
	}

	@Override
	public void updateClient(Client c) {
		clientDao.updateClient(c);

	}

	//@Override
	public List<Client> chercherClients(String motCle) {
		return clientDao.chercherClients(motCle);
	}

}
