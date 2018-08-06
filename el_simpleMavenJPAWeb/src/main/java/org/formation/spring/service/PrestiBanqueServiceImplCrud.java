package org.formation.spring.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.formation.spring.dao.CrudClientDAO;
import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class PrestiBanqueServiceImplCrud implements IPrestiBanqueService {
	private static final Logger LOGGER =  LoggerFactory.getLogger(PrestiBanqueServiceImplCrud.class);

	@Autowired
	private CrudClientDAO crudClientDAO;

	@PostConstruct
	public void createSomeClient() {
		addClient(new Client("Durand", "Marie", "mdurand", "1234", new Adresse(1, "rue de la Source", "Paris")));
		addClient(new Client("Durand", "Jacques", "jdurand", "1234", new Adresse(1, "rue de la Source", "Paris")));
	}
	
	@Override
	public void addClient(Client c) {
		crudClientDAO.save(c);
	}

	@Override
	public List<Client> listClients() {
		LOGGER.debug("lister clients");
		LOGGER.info("information");

		Iterable<Client> clients = crudClientDAO.findAll();
		return crudClientDAO.findAll();
	}

	@Override
	public void deleteClient(int idClient) {
		crudClientDAO.delete(idClient);

	}

	@Override
	public Client editClient(int idClient) {
		return crudClientDAO.findOne(idClient);
	}

	@Override
	public void updateClient(Client c) {
		crudClientDAO.save(c);

	}

	

}
