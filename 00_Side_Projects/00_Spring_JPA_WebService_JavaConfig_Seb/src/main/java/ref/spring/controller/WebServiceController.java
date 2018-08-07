package ref.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ref.spring.model.Client;
import ref.spring.service.Service;

@RestController
public class WebServiceController {

// http://localhost:8080/Spring_JPA_WebService_JavaConfig/clients
	
	@Autowired
	Service service;
	
	@GetMapping(value="/clients", produces = "application/json")
	public List<Client> getAllClient(){
		return service.selectAll();
	}
	
}
