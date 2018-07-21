package net.lecigne.onetomany.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.onetomany.model.Professor;

public class B_Get {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Professor prof = null;

		try {
			txn.begin();
			// Pas besoin de cast en JPA
			prof = em.find(Professor.class, 1L);
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}

		System.out.println(prof); // Attention au toString() - s'il cherche à accéder aux étudiants -> erreur

	}
}
