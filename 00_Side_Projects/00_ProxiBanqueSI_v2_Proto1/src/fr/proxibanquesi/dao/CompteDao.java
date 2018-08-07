package fr.proxibanquesi.dao;

import fr.proxibanquesi.model.Compte;

public interface CompteDao {

	// *** CREATION ***

	void creerCompte(Compte compte);
	
	// *** LECTURE ***
	
	Compte obtenirCompte(int idClient);

}
