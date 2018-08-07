package net.lecigne.proxibanquesi.service;

import net.lecigne.proxibanquesi.model.Conseiller;

public interface ConseillerService {

	void creerConseiller(Conseiller conseiller);
	
	Conseiller obtenirConseiller(String login, String password);
	
}
