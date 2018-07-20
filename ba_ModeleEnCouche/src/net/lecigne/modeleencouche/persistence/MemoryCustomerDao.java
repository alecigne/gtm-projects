package net.lecigne.modeleencouche.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.lecigne.modeleencouche.model.Client;

/**
 * CRUD
 * 
 * @author Anthony Le Cigne
 *
 */

public class MemoryCustomerDao implements CustomerDao {
	
	// Static - do not risk multiple implementations
	private static final Map<Integer, Client> DB = new HashMap<>();

	@Override
	public void save(Client c) {
		c.setId(DB.size()); // Sufficient for our use case
		DB.put(c.getId(), c);
	}

	@Override
	public Client findById(int id) {
		return DB.get(id);
	}

	@Override
	public void delete(int id) {
		DB.remove(id);
	}

	@Override
	public List<Client> findAll() {
		return new ArrayList<>(DB.values());
//		Collection<Customer> customers = DB.values();
//		List<Customer> listCustomers = new ArrayList<>(customers);
	}

}
