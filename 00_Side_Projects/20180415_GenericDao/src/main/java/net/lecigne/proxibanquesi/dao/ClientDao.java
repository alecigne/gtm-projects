package net.lecigne.proxibanquesi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import net.lecigne.proxibanquesi.model.Client;

public class ClientDao extends CRUDImp<Client> {

	@Override
	public Client obtenir(long idClient) {
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
			JPAUtil.closeEMF();
		}
		return client;
	}

}
