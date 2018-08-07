package ref.spring.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import ref.spring.model.Adresse;
import ref.spring.model.Client;
import ref.spring.persistence.DAO;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	private DAO dao;

	@PostConstruct
	public void createSomeClient() {
		
		add(new Client("André", new Adresse("Paris")));
		add(new Client("José", new Adresse("Lyon")));
		add(new Client("René", new Adresse("Sarlat")));
	}

	@Override
	public void add(Client client) {

		dao.save(client);
	}

	@Override
	public List<Client> selectAll() {

		return dao.findAll();
	}

}
