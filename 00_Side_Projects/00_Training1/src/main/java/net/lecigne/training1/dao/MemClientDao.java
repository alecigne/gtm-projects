package net.lecigne.training1.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

import java.util.TreeMap;

import net.lecigne.training1.model.Client;

@Repository("memDao")
public class MemClientDao implements ManualClientDao {

	private static final TreeMap<Long, Client> DB = new TreeMap<>();

	@Override
	public void sauvegarder(Client client) {
		// Si on sauvegarde un objet déjà référencé dans le TreeMap (du point de vue
		// mémoire et non métier), alors ne rien faire.
		if (DB.get(client.getId()) == client) {
			return;
		}
		long idClientUnique = genererIdUnique();
		client.setId(idClientUnique);
		DB.put(idClientUnique, client);
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
	public Client obtenir(Long idClient) {
		return DB.get(idClient);
	}

	@Override
	public List<Client> obtenirTous() {
		return new ArrayList<Client>(DB.values());
	}

	@Override
	public void supprimer(Long idClient) {
		DB.remove(idClient);
	}

}
