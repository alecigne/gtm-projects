package net.lecigne.gestionsalles.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.lecigne.gestionsalles.model.Etudiant;
import net.lecigne.gestionsalles.model.Promotion;
import net.lecigne.gestionsalles.model.Salle;
import net.lecigne.gestionsalles.util.RndStr;

public class A_CreerSalles {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		// Etudiants

		Etudiant etudiant1 = new Etudiant(RndStr.generate(8));
		Etudiant etudiant2 = new Etudiant(RndStr.generate(8));
		Etudiant etudiant3 = new Etudiant(RndStr.generate(8));
		Etudiant etudiant4 = new Etudiant(RndStr.generate(8));
		Etudiant etudiant5 = new Etudiant(RndStr.generate(8));

		// Promotions

		Promotion promo1 = new Promotion(RndStr.generate(8));
		Promotion promo2 = new Promotion(RndStr.generate(8));
		Promotion promo3 = new Promotion(RndStr.generate(8));

		// Affectation étudiants - promotions
		// Promotion est inverse end (côté One du OneToMany)

		promo1.addEtudiant(etudiant1);
		promo1.addEtudiant(etudiant2);

		promo2.addEtudiant(etudiant3);
		promo2.addEtudiant(etudiant4);
		
		promo3.addEtudiant(etudiant5);

		// Salles

		Salle salle1 = new Salle(RndStr.generate(8));
		Salle salle2 = new Salle(RndStr.generate(8));

		// Affectation salle - promotions
		// Promotion est inverse end (choix arbitraire, côté Many d'un ManyToMany)
		
		// Salle 1 : 2 promos associées

		promo1.addSalle(salle1);
		promo2.addSalle(salle1);

		// Salle 2 : 1 seule promo

		promo1.addSalle(salle2);
		
		// La promo3 n'a pas de salle, on doit la persister à un moment
		
		try {
			txn.begin();
			em.persist(salle1);
			em.persist(salle2);
			em.persist(promo3);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

}
