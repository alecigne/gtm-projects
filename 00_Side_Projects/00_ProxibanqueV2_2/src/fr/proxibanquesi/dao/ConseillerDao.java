package fr.proxibanquesi.dao;

import fr.proxibanquesi.model.Conseiller;

/**
 * Cette interface permet de connaitre un conseiller identifié par son login
 * 
 * @author Anthony le Cigne et Jean-Michel Hiltbrunner
 *
 */
public interface ConseillerDao {

	/**
	 * A partir d'un login renvoie les informations sur le conseiller interrogé
	 * 
	 * @param login
	 *            l'identifiant unique du conseiller
	 * @return le conseiller identifié par son login
	 */
	Conseiller obtenirConseiller(String login);

}
