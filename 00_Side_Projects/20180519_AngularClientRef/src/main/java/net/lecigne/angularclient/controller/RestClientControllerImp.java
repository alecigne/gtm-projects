package net.lecigne.angularclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import net.lecigne.angularclient.model.Client;
import net.lecigne.angularclient.service.AppServiceImp;

@RestController
public class RestClientControllerImp implements RestClientController {
	
	@Autowired
	AppServiceImp service;

	@Override
	public List<Client> getAllClients() {
		return service.obtenirTousClients();
	}

}
