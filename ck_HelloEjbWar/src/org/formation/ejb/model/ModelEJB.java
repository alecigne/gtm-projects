package org.formation.ejb.model;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Stateful
public class ModelEJB {
	
	@PersistenceUnit
	private EntityManagerFactory emf;
	
	public void putUserMessage(final String messageString) throws MessageException {
		this.deleteMessage();
		final Message message = new Message("1", "(" + messageString + ")" + " in a database");
		final EntityManager em = emf.createEntityManager();
		em.persist(message);
	}
	
	public String getStoredMessage() throws MessageException {
		final EntityManager em = emf.createEntityManager();
		final List messages = em.createNamedQuery("findMessages").getResultList();
		if (messages.size() > 0) {
			final Message message = (Message) messages.get(0);
			return "(" + message.getMessageString() + "), inside the EJB";
		} else {
			throw new MessageException("There was nothing in the database.");
		}
	}
	
	public void deleteMessage() {
		EntityManager em = emf.createEntityManager();
		em.createNamedQuery("deleteMessages").executeUpdate();
	}
	
}
