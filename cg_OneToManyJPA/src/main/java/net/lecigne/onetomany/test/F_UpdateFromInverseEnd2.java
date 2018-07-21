package net.lecigne.onetomany.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.onetomany.model.Professor;
import net.lecigne.onetomany.model.Student;

public class F_UpdateFromInverseEnd2 {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			Professor professor = em.find(Professor.class, 1L);
			Student student = em.find(Student.class, 1L);
			// On redonne le prof n°1 à l'étudiant n°1
			// MAJ du point de vue de l'inverse end avec une méthode spéciale
			professor.addStudent(student);
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
