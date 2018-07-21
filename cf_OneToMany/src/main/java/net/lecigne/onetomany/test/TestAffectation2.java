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

public class TestAffectation2 {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static SecureRandom rnd = new SecureRandom();
	
	public static String randomString(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
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
			// MAJ à partir du owner (porteur de FK)
			student.setProfessor(professor);
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
