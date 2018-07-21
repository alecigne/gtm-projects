package net.lecigne.manytomany.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.manytomany.model.Actor;
import net.lecigne.manytomany.model.Movie;

public class C_GetTooLate {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Movie movie = null;

		try {
			txn.begin();
			movie = em.find(Movie.class, 2L);
			// Appel à la liste d'acteurs, les acteurs sont récupérés un par un. L'objet est
			// "rempli".
			// Alternative : mode EAGER pour l'option FetchType dans la classe Movie (cf.)
			movie.getActors().size();
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

		// Ne marche qu'avec l'appel à la méthode size ci-dessus
		for (Actor actor : movie.getActors()) {
			System.out.println(actor);
		}

	}
}
