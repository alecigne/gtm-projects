package net.lecigne.webuserssql.service;

import net.lecigne.webuserssql.model.Conseiller;

/**
 * Cette interface recense les opérations qui peuvent être effectuées sur les
 * conseillers.
 * 
 * @author Anthony Le Cigne
 *
 */

public interface IConseillerService {

	void creerConseiller(Conseiller conseiller);
	
	public Conseiller obtenirConseiller(String login);
	
}
