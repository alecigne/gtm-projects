package net.lecigne.manytomany.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import net.lecigne.manytomany.model.Movie;

public class D_GetJPQL {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();

		TypedQuery<Movie> tq = em.createQuery("SELECT m FROM Movie m "
				+ "JOIN FETCH m.actors i WHERE m.id = :id", Movie.class);
		
		tq.setParameter("id", 1L);
		
		Movie m = tq.getSingleResult();
		
		em.close();
		emf.close();
		
		System.out.println(m.getActors());

	}
}
