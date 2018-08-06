package org.formation.spring.service;

import java.util.List;

import org.formation.spring.dao.CrudClientDAO;
import org.formation.spring.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class PrestiBanqueServiceImpl implements IPrestiBanqueService {
	private static final Logger LOGGER =  LoggerFactory.getLogger(PrestiBanqueServiceImpl.class);
	
	@Autowired
	private CrudClientDAO crudClientDao;

	public void setClientDao(CrudClientDAO clientDao) {
		this.crudClientDao = clientDao;
	}

	@Override
	public void addClient(Client c) {
		crudClientDao.save(c);
	}

	@Override
	public List<Client> listClients() {
		LOGGER.debug("lister clients");
		LOGGER.info("information");
		return crudClientDao.findAll();
	}

	@Override
	public void deleteClient(int idClient) {
		crudClientDao.delete(idClient);

	}

	@Override
	public Client editClient(int idClient) {
		return crudClientDao.findOne(idClient);
	}

	@Override
	public void updateClient(Client c) {
		crudClientDao.save(c);
	}

//	@Override
//	public List<Client> chercherClients(String motCle) {
//		return crudClientDao.chercherClients(motCle);
//	}

}
