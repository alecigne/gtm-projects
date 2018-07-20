package net.lecigne.modeleencouche.presentation;

import net.lecigne.modeleencouche.model.Client;
import net.lecigne.modeleencouche.service.Service;
import net.lecigne.modeleencouche.service.ServiceImp;

public class Presentation {

	public static void main(String[] args) {
		
		// Initializations
		
		Service cs = new ServiceImp();
		Client customer1 = new Client("Bill");
		Client customer2 = new Client("Bob");
		Client customer3 = null;
		
		// Scenario
		
		cs.addCustomer(customer1);
		cs.addCustomer(customer2);
		cs.addCustomer(customer3);
		
		System.out.println(cs.getAllCustomers());
		System.out.println(cs.getValidatedCustomer(0));
	
	}

}