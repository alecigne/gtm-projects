package net.lecigne.angularclient.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import net.lecigne.angularclient.model.Client;

public interface RestClientController {
	
	@GetMapping(value="/clients", produces="application/json")
	List<Client> getAllClients();
	
}
