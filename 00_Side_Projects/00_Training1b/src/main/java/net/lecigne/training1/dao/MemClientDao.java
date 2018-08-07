package net.lecigne.training1.dao;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

import java.util.TreeMap;

import net.lecigne.training1.model.Client;

@Repository("memDao")
public class MemClientDao implements CRUDClient {

	private static final TreeMap<Long, Client> DB = new TreeMap<>();

	@Override
	public <S extends Client> S save(S client) {
		// Si on sauvegarde un objet déjà référencé dans le TreeMap (du point de vue
		// mémoire et non métier), alors ne rien faire.
		if (DB.get(client.getId()) == client) {
			return null;
		}
		long idClientUnique = genererIdUnique();
		client.setId(idClientUnique);
		DB.put(idClientUnique, client);
		return client;
	}
	
	/**
	 * Génère une clé unique basée sur l'ordre des clés d'un TreeMap.
	 * 
	 * @return clé unique
	 */
	private long genererIdUnique() {
		Entry<Long, Client> lastEntry = DB.lastEntry();
		if (lastEntry != null) {
			return lastEntry.getKey() + 1;
		} else {
			return 0;
		}
	}

	@Override
	public void modifier(Client client) {
		DB.put(client.getId(), client);
	}

	@Override
	public Client findOne(Long id) {
		return DB.get(id);
	}
	
	@Override
	public Iterable<Client> findAll() {
		return new ArrayList<Client>(DB.values());
	}
	
	@Override
	public void delete(Long id) {
		DB.remove(id);		
	}
	
	@Override
	public <S extends Client> Iterable<S> save(Iterable<S> entities) {
		throw new java.lang.UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean exists(Long id) {
		throw new java.lang.UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Iterable<Client> findAll(Iterable<Long> ids) {
		throw new java.lang.UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public long count() {
		throw new java.lang.UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Client entity) {
		throw new java.lang.UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Iterable<? extends Client> entities) {
		throw new java.lang.UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void deleteAll() {
		throw new java.lang.UnsupportedOperationException("Not supported yet.");
	}

}
