package net.lecigne.proxibanquesi.tests;

import net.lecigne.proxibanquesi.model.Conseiller;
import net.lecigne.proxibanquesi.service.ConseillerService;
import net.lecigne.proxibanquesi.service.ConseillerServiceImp;

public class TestService {

	public static void main(String[] args) {
		
		ConseillerService conseillerService = new ConseillerServiceImp();
		
		Conseiller conseiller = new Conseiller("Le Cigne", "Anthony");
		
		conseillerService.creerConseiller(conseiller);
		
	}
	
}
