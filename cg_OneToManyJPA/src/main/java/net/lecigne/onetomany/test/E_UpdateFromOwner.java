package net.lecigne.onetomany.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.onetomany.model.Professor;
import net.lecigne.onetomany.model.Student;

public class E_UpdateFromOwner {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			Professor professor = em.find(Professor.class, 3L);
			Student student = em.find(Student.class, 1L);
			// On donne au prof n°3 l'étudiant n°1
			// MAJ à partir du owner (porteur de FK) - ça fonctionne.
			student.setProfessor(professor);
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
