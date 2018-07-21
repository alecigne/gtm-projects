package net.lecigne.onetoone.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.lecigne.onetoone.model.Customer;
import net.lecigne.onetoone.util.HibernateUtil;

public class Delete {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public static void main(String[] args) {

		Session session = sessionFactory.openSession();
		Transaction txn = session.getTransaction();

		try {
			txn.begin();
			// Le passeport est supprimé si présent - grâce au CascadeType.REMOVE de la classe Customer
			session.delete(session.get(Customer.class, 1L));
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
