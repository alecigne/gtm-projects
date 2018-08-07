package fr.proxibanquesi.service;

import fr.proxibanquesi.model.Compte;

public interface CompteService {

	void associerCompte(int idClient);
	
	Compte obtenirCompte(int idClient);
	
}
