package ref.spring.service;

import java.util.List;

import ref.spring.model.Client;

public interface Service {

	public void add(Client client);

	public List<Client> selectAll();

}
