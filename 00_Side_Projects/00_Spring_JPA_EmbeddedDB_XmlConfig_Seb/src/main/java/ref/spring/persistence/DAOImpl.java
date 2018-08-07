package ref.spring.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hsqldb.rights.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ref.spring.model.Voiture;

@Repository
public class DAOImpl implements DAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void add(Voiture voiture) {

		entityManager.persist(voiture);
	}

	@Override
	@Transactional
	public int count() {

		TypedQuery<Voiture> typedQuery = entityManager.createQuery("from Voiture", Voiture.class);

		return typedQuery.getResultList().size();
	}

}
