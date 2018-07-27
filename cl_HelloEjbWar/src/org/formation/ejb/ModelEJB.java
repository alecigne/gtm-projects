package org.formation.ejb;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
		try {
			final String decodedMessage = URLDecoder.decode(messageString, "UTF-8");
			final Message message = new Message("1", "(" + messageString + ")" + " in a mysql database");
			final EntityManager em = emf.createEntityManager();
			em.persist(message);
		} catch (final UnsupportedEncodingException uee) {
			throw new MessageException("something odd about that message..." + messageString);
		}
	}

	public String getStoredMessage() throws MessageException {
		final EntityManager em = emf.createEntityManager();
		final List<Message> messages = em.createNamedQuery("findMessages",Message.class).getResultList();
		if (messages.size() > 0) {
			final Message message = messages.get(0);
			return "(" + message.getMessageString() + "), inside the EJB";
		} else {
			throw new MessageException("There was nothing in the database.");
		}
	}

	public void deleteMessage() {
		final EntityManager em = emf.createEntityManager();
		em.createNamedQuery("deleteMessages").executeUpdate();
	}

}