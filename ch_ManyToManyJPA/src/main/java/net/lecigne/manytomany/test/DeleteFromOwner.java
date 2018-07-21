package net.lecigne.manytomany.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.manytomany.model.Actor;
import net.lecigne.manytomany.model.Movie;

public class DeleteFromOwner {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			Movie movie = em.find(Movie.class, 2L);
			Actor actor = em.find(Actor.class, 1L);
			// MAJ à partir du owner (porteur de FK)
			movie.getActors().remove(actor);
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
