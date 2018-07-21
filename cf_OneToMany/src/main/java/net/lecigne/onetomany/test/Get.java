package net.lecigne.onetomany.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.lecigne.onetomany.model.Professor;
import net.lecigne.onetomany.util.HibernateUtil;

public class Get {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public static void main(String[] args) {

		Session session = sessionFactory.openSession();
		Transaction txn = session.getTransaction();
		Professor professor = null;

		try {
			txn.begin();
			// On caste - raisons de rétrocompatibilité
			professor = (Professor) session.get(Professor.class, new Long(1));
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

		System.out.println(professor);

	}
}
