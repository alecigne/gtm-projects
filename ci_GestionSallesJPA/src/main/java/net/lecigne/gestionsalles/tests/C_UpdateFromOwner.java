package net.lecigne.gestionsalles.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.gestionsalles.model.Promotion;
import net.lecigne.gestionsalles.model.Salle;

/**
 * La salle est owner. On ajoute la promo2 à la salle 2.
 * 
 * @author Anthony Le Cigne
 *
 */

public class C_UpdateFromOwner {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			Salle salle = em.find(Salle.class, 2L);
			Promotion promotion = em.find(Promotion.class, 2L);
			salle.getPromotions().add(promotion);
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
			emf.close();
		}

	}

}
