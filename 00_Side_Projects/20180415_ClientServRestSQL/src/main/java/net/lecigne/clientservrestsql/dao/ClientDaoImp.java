package net.lecigne.clientservrestsql.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import net.lecigne.clientservrestsql.model.Client;

public class ClientDaoImp implements ClientDao {

	@Override
	public void creerClient(Client client) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			em.persist(client);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	@Override
	public Client obtenirClient(long idClient) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		Client client = null;
		
		try {
			txn.begin();
			client = em.find(Client.class, idClient);
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return client;
	}

	@Override
	public void modifierClient(Client client) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			em.merge(client);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
	}

	@Override
	public void supprimerClient(long idClient) {

		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			em.remove(em.find(Client.class, idClient));
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
	}

	@Override
	public List<Client> obtenirTousClients() {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();
		ArrayList<Client> listeClients = new ArrayList<>();
		TypedQuery<Client> tq = em.createQuery("SELECT c FROM Client c", Client.class);
		listeClients = (ArrayList<Client>) tq.getResultList();
		return listeClients;
	}

}
