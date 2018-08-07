package net.lecigne.proxibanquesi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CRUDImp<T> implements CRUD<T> {

	@Override
	public void creer(T t) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			em.persist(t);
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
			JPAUtil.closeEMF();
		}

	}

	@Override
	public T obtenir(long id) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			em.find(T.class, id);
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
	}

	@Override
	public void modifier(T t) {
		// TODO Auto-generated method stub

	}

}
