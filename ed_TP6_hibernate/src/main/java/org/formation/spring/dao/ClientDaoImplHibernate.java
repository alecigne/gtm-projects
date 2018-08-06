package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("hibernatedao")
public class ClientDaoImplHibernate implements IClientDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	// Injection par constructeur quand besoin "vital" de l'élément (instancié quand même)

	@Transactional // On peut reprendre la main - cf. interceptor
	@Override
	public void addClient(Client c) {
		Session session = sessionFactory.getCurrentSession();
		session.save(c);
	}

	@Transactional
	@Override
	public List<Client> listClients() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Client");
		return query.list();
	}

	@Transactional
	@Override
	public void deleteClient(int idClient) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(this.editClient(idClient));
	}

	@Transactional
	@Override
	public Client editClient(int idClient) {
		Session session = sessionFactory.getCurrentSession();
		Client client = (Client) session.get(Client.class, idClient);
		return client;
	}

	@Override
	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> chercherClients(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

}
