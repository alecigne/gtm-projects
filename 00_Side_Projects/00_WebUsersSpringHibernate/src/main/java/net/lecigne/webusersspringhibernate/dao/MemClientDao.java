package net.lecigne.webusersspringhibernate.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import net.lecigne.webusersspringhibernate.model.Client;

public class MemClientDao implements ClientDao {
	
	private static final TreeMap<Long, Client> DB = new TreeMap<>();

	@Override
	public void addClient(Client client) {
		long uniqueIdClient = genererIdUnique();
		client.setId(uniqueIdClient);
		DB.put(uniqueIdClient, client);
	}
	
	private long genererIdUnique() {
		Entry<Long, Client> lastEntry = DB.lastEntry();
		if (lastEntry != null) {
			return lastEntry.getKey() + 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public Client getClient(long idClient) {
		return DB.get(idClient);
	}

	@Override
	public List<Client> getAllClients() {
		return new ArrayList<Client>(DB.values());
	}

	@Override
	public void updateClient(Client client) {
		DB.put(client.getId(), client);
	}

	@Override
	public void deleteClient(long idClient) {
		DB.remove(idClient);
	}

}
