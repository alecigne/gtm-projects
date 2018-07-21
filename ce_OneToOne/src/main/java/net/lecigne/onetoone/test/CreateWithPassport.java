package net.lecigne.onetoone.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.lecigne.onetoone.model.Customer;
import net.lecigne.onetoone.model.Passport;
import net.lecigne.onetoone.util.HibernateUtil;
import net.lecigne.onetoone.util.RndStr;

public class CreateWithPassport {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public static void main(String[] args) {

		Session session = sessionFactory.openSession();
		Transaction txn = session.getTransaction();
		Passport passport = new Passport(RndStr.generate(8));
		Customer customer = new Customer(RndStr.generate(8));

		// Relation bidirectionnelle ; on doit refléter ceci côté objet. Cela dit, la
		// première ligne suffit pour ce qui est de la base de données.
		//
		// Si on ne met que la deuxième ligne, alors le Customer n'aura pas de
		// passeport. En effet, l'objet de classe Passport n'a pas les moyens
		// d'influencer la table Customer (pas propriétaire).
		//
		// On peut remédier à cela grâce à la méthode addCustomer de la classe Passport
		// (qui fait les deux étapes).
		customer.setPassport(passport);
		passport.setCustomer(customer);

//		passport.addCustomer(customer);

		try {
			txn.begin();
			// Ceci n'est pas nécessaire grâce au CascadeType.PERSIST de la classe Customer
			// session.persist(passport);
			session.persist(customer);
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
