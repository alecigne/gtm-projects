package net.lecigne.angularclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.lecigne.angularclient.model.Client;
import net.lecigne.angularclient.service.AppService;

@Controller
public class ClientController {

	@Autowired
	private AppService service;

	@RequestMapping(value = "/displayClients", method = RequestMethod.GET)
	public ModelAndView listClients() {
		List<Client> clients = service.obtenirTousClients();
		return new ModelAndView("displayClients", "clients", clients);
	}

}
