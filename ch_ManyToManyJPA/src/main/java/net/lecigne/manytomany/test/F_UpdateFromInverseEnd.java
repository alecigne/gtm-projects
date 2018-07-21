package net.lecigne.manytomany.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.manytomany.model.Actor;
import net.lecigne.manytomany.model.Movie;

public class F_UpdateFromInverseEnd {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Actor actor = null;
		Movie movie = null;

		try {
			txn.begin();
			movie = em.find(Movie.class, 3L);
			actor = em.find(Actor.class, 1L);
			// MAJ du point de vue de l'inverse end, pas de droit de MAJ
//			actor.getMovies().add(movie);
			actor.addMovie(movie);
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
			if (emf != null) {
				emf.close();
			}
		}

	}

}
