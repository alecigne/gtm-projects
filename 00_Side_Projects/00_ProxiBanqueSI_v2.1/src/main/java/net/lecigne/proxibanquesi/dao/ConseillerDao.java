package net.lecigne.proxibanquesi.dao;

import net.lecigne.proxibanquesi.model.Conseiller;

public interface ConseillerDao {
	
	void creerConseiller(Conseiller conseiller);

	Conseiller obtenirConseiller(String login);

}
