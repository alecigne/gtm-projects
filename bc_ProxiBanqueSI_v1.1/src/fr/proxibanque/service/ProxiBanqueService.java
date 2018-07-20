package fr.proxibanque.service;

import java.util.*;
import fr.proxibanque.modele.*;

/**
 * Cette interface recense les opérations que peuvent effectuer les conseillers
 * bancaires de ProxiBanque.
 * 
 * @author Anthony Le Cigne
 *
 */

public interface ProxiBanqueService {

	// *** GESTION CLIENTS ***
	
	/**
	 * Permet de créer un client dans la base de donnée ProxiBanque. La création
	 * n'est pas effectuée si le conseiller a déjà 10 clients à sa charge.
	 * 
	 * @param	cons		conseiller proxibanque
	 * @param	cli			client proxibanque
	 * @return	idRetour	id client proxibanque
	 */
	public String creerClient(Client client);
	public void modifierClient(String id, Client nouveauClient);
	public Client obtenirClient(String id);
	public void supprimerClient(String id);
	public List<Client> obtenirListeClients();

	// *** GESTION COMPTES ***
	
	public void assignerCompteEpargne(String id);
	
	// *** GESTION CARTES ***
	
	public void assignerCarte(String id, CarteVisa carte);
	
	// *** OPERATIONS ***
	
	public double simulerCredit(double montant, int dureeMois, double taux);
	public void faireVirement(String idClientDebit, String idClientCredit,
			double montant);
	public void crediterCompte(String id, double montant);
	public ArrayList<Client> auditerAgence();
	
}
