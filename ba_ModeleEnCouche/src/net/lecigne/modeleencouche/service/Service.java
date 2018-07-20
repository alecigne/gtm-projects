package net.lecigne.modeleencouche.service;

import java.util.List;

import net.lecigne.modeleencouche.model.Client;

public interface Service {

	void addCustomer(Client c);
	Client getValidatedCustomer(int id);
	List<Client> getAllCustomers();

}