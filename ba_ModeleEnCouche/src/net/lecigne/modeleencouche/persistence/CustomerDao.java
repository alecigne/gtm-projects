package net.lecigne.modeleencouche.persistence;

import java.util.List;

import net.lecigne.modeleencouche.model.Client;

public interface CustomerDao {

	void save(Client c);
	Client findById(int id);
	void delete(int id);
	List<Client> findAll();

}