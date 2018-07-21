package net.lecigne.gestionsalles.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.gestionsalles.model.Promotion;

/**
 * On supprime la promo3 (sans salle), et son étudiant !
 * 
 * @author Anthony Le Cigne
 *
 */

public class B_SuppressionSimple {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			// Suppression de la promo 1, les étudiants sont supprimés
			em.remove(em.find(Promotion.class, 3L));
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

}
