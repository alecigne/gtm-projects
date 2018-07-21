package net.lecigne.onetomany.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.onetomany.model.Professor;
import net.lecigne.onetomany.model.Student;
import net.lecigne.onetomany.util.RndStr;

public class A_CreateWithStudents {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		// Professor

		Professor professor1 = new Professor(RndStr.generate(8));
		Professor professor2 = new Professor(RndStr.generate(8));
		Professor professor3 = new Professor(RndStr.generate(8));

		// Students

		Student student1 = new Student(RndStr.generate(8));
		Student student2 = new Student(RndStr.generate(8));

		// Affectation

		professor1.getStudents().add(student1);
		professor1.getStudents().add(student2);

		// Affectation bidirectionnelle. Mieux pour la logique objet, et indispensable
		// ici pour remplir les FK dans la BDD.
		student1.setProfessor(professor1);
		student2.setProfessor(professor1);
		
		// Idem
		
		professor3.getStudents().add(student1);
		student1.setProfessor(professor3);

		// La méthode addStudent de la classe Professor permettrait de faire ça plus
		// simplement - on ne l'avait pas vue à ce moment.
		// professor.addStudent(student1);
		// professor.addStudent(student2);

		try {
			txn.begin();
			em.persist(professor1);
			em.persist(professor2);
			em.persist(professor3);
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
