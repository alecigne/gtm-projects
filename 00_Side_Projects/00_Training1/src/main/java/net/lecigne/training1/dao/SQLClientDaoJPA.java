package net.lecigne.training1.dao;

import java.util.List;

import javax.persistence.EntityManager;import javax.persistence.IdClass;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.lecigne.training1.model.Client;

@Repository("sqlDaoJpa")
@Transactional
public class SQLClientDaoJPA implements ManualClientDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void sauvegarder(Client client) {
		entityManager.persist(client);
	}

	@Override
	public void modifier(Client client) {
		entityManager.merge(client);
	}

	@Override
	public Client obtenir(Long idClient) {
		return entityManager.find(Client.class, idClient);
	}

	@Override
	public List<Client> obtenirTous() {
		String qlString = "from Client";
		TypedQuery<Client> tq = entityManager.createQuery(qlString, Client.class);
		return tq.getResultList();
	}

	@Override
	public void supprimer(Long idClient) {
		entityManager.remove(this.obtenir(idClient));
	}

}
