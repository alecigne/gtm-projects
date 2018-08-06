package net.lecigne.webusers.dao;

import java.util.*;
import net.lecigne.webusers.model.Client;

/**
 * Cette classe impl�mente l'interface ClientDAO au niveau d'un objet de type
 * Map stock� en m�moire. Elle contient des m�thodes permettant de r�aliser le
 * CRUD sur celui-ci.
 * 
 * @author Joumard S�bastien, Le Cigne Anthony
 *
 */

public class MemClientDAO implements ClientDAO {

	private static final Map<String, Client> DB = new TreeMap<>();
	
	@Override
	public String sauvegarder(Client c) {
		String uniqueId = genererIdUnique(c);
		c.setId(uniqueId);
		DB.put(uniqueId, c);
		return uniqueId;
	}
	
	/**
	 * G�n�re un ID unique relativement � la base de donn�es statique.
	 * 
	 * @param	client	Le client pour qui un ID unique doit �tre g�n�r�.
	 * @return	id		L'ID unique, al�atoire.
	 */
	private String genererIdUnique(Client client) {
		String id = genererId(client);
		while (DB.containsKey(id)) {
			id = genererId(client);
		}
		return id;
	}
	
	/**
	 * Generate a lowercase ID by concatenating the first letter of the first
	 * name, the last name, and a random 4-digits sequence.
	 * 
	 * @param	client	The client for whom an ID should be generated.
	 * @return	id		The random ID.
	 */
	private String genererId(Client client) {
		String id = new String();
		id = (client.getPrenom().substring(0, 1) + client.getNom()); 	// "JVon Neumann"
		id = id.toLowerCase().replaceAll("\\s","");			// "jvonneumann"
		int randomNumber = (int) (Math.random() * 10_000);	// "jvonneumann336"
		id += String.format("%04d", randomNumber);			// "jvonneumann0336"
		return id;
	}

	@Override
	public void modifier(String id, Client c) {
		c.setId(id);
		DB.put(id, c);
	}

	@Override
	public Client obtenir(String id) {
		return DB.get(id);
	}

	@Override
	public void supprimer(String id) {
		DB.remove(id);
	}

	@Override
	public List<Client> obtenirTous() {
		return new ArrayList<Client>(DB.values());
	}

}