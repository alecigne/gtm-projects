package fr.proxibanque.service;

import java.text.SimpleDateFormat;
import java.util.*;
import fr.proxibanque.modele.*;
import fr.proxibanque.persistance.*;

/**
 * Cette classe implémente l'interface ConseillerService. Elle fournit les
 * méthodes permettant aux conseillers d'effectuer les opérations nécessaires à
 * l'activité de ProxiBanque (gestion des clients, des comptes, des cartes, et
 * opérations diverses).
 * 
 * @author Anthony Le Cigne
 *
 */

public class ProxiBanqueServiceImp implements ProxiBanqueService {

	private DAO<Client> dao = new MemClientDAO();

	// *** HELPER METHODS ***

	/**
	 * Permet de générer une chaîne de caractères composée de 8 chiffres
	 * aléatoires, utilisée comme numéro de compte et/ou de numéro de carte.
	 * 
	 * @return str chaîne de caractères à chiffres aléatoire
	 */
	private String genererNumero() {
		String str = "";
		int randomNumber = (int) (Math.random() * 1_000_000_000);
		str = str + String.format("%09d", randomNumber);
		return str;
	}

	/**
	 * Permet de générer la date de création d'un compte au format yyyy-MM-dd.
	 * 
	 * @return date de type chaîne de caractère
	 */
	private String genererDateCreation() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		return sdfDate.format(now);
	}

	private CompteCourant creerCompteCourant() {
		String numeroCompte = genererNumero();
		String dateCreation = genererDateCreation();
		return new CompteCourant(numeroCompte, 0.0, dateCreation);
	}

	// *** GESTION CLIENTS ***

	@Override
	public String creerClient(Client client) {
		String idRetour = "";
		if (client != null) {
			client.setCompteCourant(creerCompteCourant());
			idRetour = dao.sauvegarder(client);
		} else {
			System.err.println("Client invalide !");
		}

		return idRetour;
	}

	@Override
	// TODO Réattribution du compte courant et du compte épargne... propre ?
	// La réattribution de l'ID est gérée par la couche DAO
	public void modifierClient(String id, Client nouveauClient) {
		Client ancienClient = dao.obtenir(id);
		CompteCourant compteCourant = ancienClient.getCompteCourant();
		CompteEpargne compteEpargne = ancienClient.getCompteEpargne();
		nouveauClient.setCompteCourant(compteCourant);
		nouveauClient.setCompteEpargne(compteEpargne);
		dao.modifier(id, nouveauClient);
	}

	@Override
	public Client obtenirClient(String id) {
		return dao.obtenir(id);
	}

	@Override
	public void supprimerClient(String id) {
		dao.supprimer(id);
	}

	@Override
	public List<Client> obtenirListeClients() {
		return dao.obtenirTous();
	}

	// *** GESTION COMPTES ***

	@Override
	public void assignerCompteEpargne(String id) {
		Client client = dao.obtenir(id);
		String numeroCompte = genererNumero();
		String dateCreation = genererDateCreation();
		client.setCompteEpargne(new CompteEpargne(numeroCompte, 0.0, dateCreation));
	}

	// *** GESTION CARTES ***

	@Override
	public void assignerCarte(String id, CarteVisa carte) {
		Client client = dao.obtenir(id);
		carte.setNumero(genererNumero());
		client.getCompteCourant().setCarte(carte);
	}

	// *** OPERATIONS ***

	@Override
	// TODO corriger implémentation - se référer au métier
	public double simulerCredit(double montant, int dureeMois, double taux) {
		return (montant / dureeMois) * taux;
	}

	@Override
	public void faireVirement(String idClientDebit, String idClientCredit,
			double montant) {
		Client clientDebit = obtenirClient(idClientDebit);
		Client clientCredit = obtenirClient(idClientCredit);
		CompteCourant compteDebit = clientDebit.getCompteCourant();
		CompteCourant compteCredit = clientCredit.getCompteCourant();
		double soldeDebit = compteDebit.getSolde();
		double soldeCredit = compteCredit.getSolde();

		if (soldeDebit - montant > CompteCourant.DECOUVERT_MAX) {
			compteDebit.setSolde(soldeDebit - montant);
			compteCredit.setSolde(soldeCredit + montant);
		} else {
			System.err.println("Dépassement du découvert autorisé !");
		}
	}

	public void crediterCompte(String id, double montant) {
		Client client = obtenirClient(id);
		double soldeCourant = client.getCompteCourant().getSolde();
		double soldeNouveau = soldeCourant + montant;
		client.getCompteCourant().setSolde(soldeNouveau);
	}

	/**
	 * @param	client	un client ProxiBanque
	 * @return			un booléen, vrai si le client ne passe pas l'audit
	 */
	private boolean auditerClient(Client client) {
		return client.getCompteCourant().getSolde() < -5000.0;
	}

	@Override
	public ArrayList<Client> auditerAgence() {
		ArrayList<Client> clients = new ArrayList<>(obtenirListeClients());
		ArrayList<Client> clientsNonRentables = new ArrayList<>();

		for (Client client : clients) {
			if (auditerClient(client)) {
				clientsNonRentables.add(client);
			}
		}

		return clientsNonRentables;
	}

}
