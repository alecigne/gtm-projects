package net.lecigne.onetoone.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.lecigne.onetoone.model.Customer;
import net.lecigne.onetoone.util.HibernateUtil;
import net.lecigne.onetoone.util.RndStr;

public class A_Create {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public static void main(String[] args) {

		Session session = sessionFactory.openSession();
		Transaction txn = session.getTransaction();
		Customer customer = new Customer(RndStr.generate(8));

		try {
			txn.begin();
			session.save(customer);
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
