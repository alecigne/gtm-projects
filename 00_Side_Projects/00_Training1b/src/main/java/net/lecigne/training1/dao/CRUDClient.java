package net.lecigne.training1.dao;

import net.lecigne.training1.model.Client;

public interface CRUDClient extends CRUD<Client> {

	void modifier(Client client);

}
