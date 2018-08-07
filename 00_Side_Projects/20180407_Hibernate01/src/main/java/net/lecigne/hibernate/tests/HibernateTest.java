package net.lecigne.hibernate.tests;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import net.lecigne.hibernate.dto.UserDetails;

public class HibernateTest {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	// Bloc statique - exécuté une seule fois
	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}

	// Alternative : on utilise la classe fournie par Yann
	// private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public static void createTestUsers() {

		List<UserDetails> users = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			UserDetails user = new UserDetails("Name #" + i);
			users.add(user);
		}

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		for (UserDetails user : users) {
			session.save(user);
		}

		session.getTransaction().commit();
		session.close();

	}

	public static void main(String[] args) {

		createTestUsers();

	}

}
