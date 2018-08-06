package net.lecigne.webuserssql.dao;

import net.lecigne.webuserssql.model.Conseiller;

/**
 * Cette interface décrit les opérations générales liées à la persistance des
 * données (CRUD - Create, Read, Update, Delete) pour les objets conseillers.
 *
 * @author Anthony Le Cigne
 *
 */

public interface IConseillerDao {

	// *** CREATION ***

	void creerConseiller(Conseiller conseiller);
	
	// *** OBTENTION ***
	
	Conseiller obtenirConseiller(String login);
	
}
