package net.lecigne.onetomany.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.lecigne.onetomany.model.Professor;
import net.lecigne.onetomany.model.Student;
import net.lecigne.onetomany.util.HibernateUtil;
import net.lecigne.onetomany.util.RndStr;

public class CreateWithStudents {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public static void main(String[] args) {

		Session session = sessionFactory.openSession();
		Transaction txn = session.getTransaction();
		
		// Professor
		
		Professor professor1 = new Professor(RndStr.generate(8));

		// Professeur sans étudiants
		Professor professor2 = new Professor(RndStr.generate(8));
		
		// Students
		
		Student student1 = new Student(RndStr.generate(8));
		Student student2 = new Student(RndStr.generate(8));
		
		// Affectation
		
		professor1.getStudents().add(student1);
		professor1.getStudents().add(student2);
		
		// Indispensable pour remplir les FK
		student1.setProfessor(professor1);
		student2.setProfessor(professor1);

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

}
