package net.lecigne.onetomany.test;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.lecigne.onetomany.model.Professor;
import net.lecigne.onetomany.model.Student;
import net.lecigne.onetomany.util.HibernateUtil;

public class TestAffectation3 {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static SecureRandom rnd = new SecureRandom();
	
	public static String randomString(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public static void populateDb() {
		Session session = sessionFactory.openSession();
		Transaction txn = session.getTransaction();
		
		// Professors
		
		Professor professor1 = new Professor(randomString(8));
		Professor professor2 = new Professor(randomString(8));
		
		// Students
		
		Student student1 = new Student(randomString(8));
		Student student2 = new Student(randomString(8));
				
		// Affectation
		
		professor2.getStudents().add(student1);
		professor2.getStudents().add(student2);
		
		// Indispensable pour remplir les FK
		student1.setProfessor(professor2);
		student2.setProfessor(professor2);

		try {
			txn.begin();
			session.persist(professor1);
			session.persist(professor2);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			sessionFactory.close();
		}
	}
	
	public static void main(String[] args) {

//		populateDb();

		Session session = sessionFactory.openSession();
		Transaction txn = session.getTransaction();
		Student student = null;
		Professor professor = null;
		
		try {
			txn.begin();
			professor = (Professor) session.get(Professor.class, 1L);
			student = (Student) session.get(Student.class, 1L);
			// MAJ du point de vue de l'inverse end, pas de droit de MAJ
			professor.addStudent(student);
			professor.setName("Jacques Monod");
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			sessionFactory.close();
		}
		
	}

}
