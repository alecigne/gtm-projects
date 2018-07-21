package net.lecigne.manytomany.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.manytomany.model.Actor;
import net.lecigne.manytomany.model.Movie;
import net.lecigne.manytomany.util.RndStr;

public class A_CreateMovies {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		// Movies

		Movie movie1 = new Movie(RndStr.generate(8));
		Movie movie2 = new Movie(RndStr.generate(8));

		// Actors

		Actor actor1 = new Actor(RndStr.generate(8));
		Actor actor2 = new Actor(RndStr.generate(8));

		// Affectation

		actor1.addMovie(movie1);
		actor2.addMovie(movie1);
		actor2.addMovie(movie2);
		
		try {
			txn.begin();
			em.persist(movie1);
			em.persist(movie2);
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
