package org.formation.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.formation.spring.dao.IClientDao;
import org.formation.spring.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PrestiBanqueService implements IPrestiBanqueService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(PrestiBanqueService.class);	
	
	@Resource(name="clientDao")
	private IClientDao clientDao;

	@Override
	public void addClient(Client c) {
		clientDao.addClient(c);
		LOGGER.info("Client ajouté !");
	}

	@Override
	public List<Client> listClients() {
		clientDao.listClients();
		return null;
	}

	@Override
	public void deleteClient(int idClient) {
		clientDao.deleteClient(idClient);		
	}

	@Override
	public Client editClient(int idClient) {
		clientDao.editClient(idClient);
		return null;
	}

	@Override
	public void updateClient(Client c) {
		clientDao.updateClient(c);		
	}

	@Override
	public List<Client> chercherClients(String motCle) {
		clientDao.chercherClients(motCle);
		return null;
	}
	
	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

}
