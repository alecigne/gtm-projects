package fr.proxibanque.persistance;

import java.util.List;

/**
 * Cette interface générique décrit les opérations générales liées à la
 * persistance des données (CRUD - Create, Read, Update, Delete) pour un objet
 * de type T doté d'un attribut d'identification ID.
 *
 * @author Anthony Le Cigne
 *
 */

public interface DAO<T> {

	// *** SAUVEGARDE ***
	
	String sauvegarder(T t);
	
	// *** LECTURE ***
	
	T obtenir(String id);
	List<T> obtenirTous();
	
	// *** MODIFICATION ***
	
	void modifier(String id, T t);
	
	// *** SUPPRESSION ***
	
	void supprimer(String id);

}