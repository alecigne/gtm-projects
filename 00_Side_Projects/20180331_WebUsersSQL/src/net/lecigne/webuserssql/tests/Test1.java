package net.lecigne.webuserssql.tests;

import net.lecigne.webuserssql.model.Conseiller;
import net.lecigne.webuserssql.service.*;

public class Test1 {

	public static void main(String[] args) {

		IClientService clientService = new ClientServiceImp();
		IConseillerService conseillerService = new ConseillerServiceImp();
		
		Conseiller conseiller1 = conseillerService.obtenirConseiller("foobar");
		System.out.println(conseiller1);
		
	}

}
