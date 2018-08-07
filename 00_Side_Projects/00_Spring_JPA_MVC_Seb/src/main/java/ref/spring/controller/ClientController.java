package ref.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ref.spring.model.Client;
import ref.spring.service.Service;

@Controller
public class ClientController {

	@Autowired
	private Service service;
	
	@RequestMapping(value="/clientListPage", method = RequestMethod.GET)
	public ModelAndView clientListMethod() {
		
		List<Client> clientList = service.selectAll();
		
		return new ModelAndView("clientListPage","clients",clientList);
	}
}
