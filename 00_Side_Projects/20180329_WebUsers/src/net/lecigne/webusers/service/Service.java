package net.lecigne.webusers.service;

import java.util.List;
import net.lecigne.webusers.model.Client;

/**
 * Cette interface recense les opérations que peuvent effectuer les conseillers
 * bancaires de ProxiBanque.
 * 
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public interface Service {

	// *** GESTION CLIENTS ***

	/**
	 * Permet de créer un client dans la base de donnée ProxiBanque et également
	 * d'attribuer ce client au conseiller responsable de la création du client. La
	 * création n'est pas effectuée si le conseiller a déjà 10 clients à sa charge.
	 * 
	 * @param cons
	 *          conseiller proxibanque
	 * @param cli
	 *          client proxibanque
	 * @return idRetour id client proxibanque
	 */
	public void creerClient(Client cli);

	public void modifierClient(String id, Client c);

	public Client obtenirClient(String id);

	public void supprimerClient(String id);

	public List<Client> obtenirListeClients();

}