package net.lecigne.modeleencouche.service;

import java.util.List;

import net.lecigne.modeleencouche.model.Client;
import net.lecigne.modeleencouche.persistence.CustomerDao;
import net.lecigne.modeleencouche.persistence.MemoryCustomerDao;

public class ServiceImp implements Service {

	private CustomerDao dao = new MemoryCustomerDao();
	
	@Override
	public void addCustomer(Client c) {
		// A HashMap can take null
		if(c != null) {
			dao.save(c);
		}
	}

	@Override
	public Client getValidatedCustomer(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Client> getAllCustomers() {
		return dao.findAll();
	}

}
