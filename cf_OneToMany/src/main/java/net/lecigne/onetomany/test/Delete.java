package net.lecigne.onetomany.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.lecigne.onetomany.model.Professor;
import net.lecigne.onetomany.util.HibernateUtil;

public class Delete {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public static void main(String[] args) {

		Session session = sessionFactory.openSession();
		Transaction txn = session.getTransaction();

		try {
			txn.begin();
			session.delete(session.get(Professor.class, 1L));
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
