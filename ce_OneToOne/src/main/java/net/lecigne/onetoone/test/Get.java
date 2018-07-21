package net.lecigne.onetoone.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.lecigne.onetoone.model.Customer;
import net.lecigne.onetoone.util.HibernateUtil;

public class Get {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public static void main(String[] args) {

		Session session = sessionFactory.openSession();
		Transaction txn = session.getTransaction();
		Customer customer = null;

		try {
			txn.begin();
			// On caste - raisons de rétrocompatibilité
			customer = (Customer) session.get(Customer.class, new Long(1));
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

		System.out.println(customer);

	}
}
