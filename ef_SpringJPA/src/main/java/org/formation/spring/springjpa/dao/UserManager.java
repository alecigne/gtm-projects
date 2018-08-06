package org.formation.spring.springjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.formation.spring.springjpa.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserManager {

	@PersistenceContext
	private EntityManager entityManager;
	
	// *** CRUD ***
	
	public boolean insertUser(User user) {
		try {
			entityManager.persist(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean insertUserByIdUser(String username, String password, boolean active) {
		User user = new User(username, password, active);
		try {
			entityManager.persist(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public User queryFindByIdUser(int id) {
		User user = entityManager.find(User.class, id);
		return user;
	}
	
	public List<User> queryFindAllUsersJPA() {
		System.out.println("UserManager queryFindAllUsers() is called");
		String qlString = "from User";
		TypedQuery<User> tq = entityManager.createQuery(qlString, User.class);
		return tq.getResultList();
	}
	
	public boolean deleteUserByIdUser(int id) {
		try {
			entityManager.remove(this.queryFindByIdUser(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// *** OTHER METHODS ***
	
	public long queryCountAllUsersJPA() {
		System.out.println("UserManager queryCountAllUsersJPA() is called");
		String qlString = "select count(u) from User u"; // 
		Query query = entityManager.createQuery(qlString);
		long count = (long) query.getSingleResult();
		return count;
	}
	
}
