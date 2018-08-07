package fr.proxibanquesi.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import fr.proxibanquesi.model.CompteCourant;
import fr.proxibanquesi.dao.*;
import fr.proxibanquesi.model.*;

public class PBServiceImp implements PBService {

	ClientDao clientDao = new ClientDaoImp();
	CompteDao compteDao = new CompteDaoImp();
	ConseillerDao consDao = new ConseillerDaoImp();

	// *** CLIENTS ***
	
	// Création

	@Override
	public void creerClient(Client client) {
		if (client != null) {
			clientDao.creerClient(client);
		}
	}

	// Lecture

	@Override
	public Client obtenirClient(int idClient) {
		return clientDao.obtenirClient(idClient);
	}

	@Override
	public List<Client> obtenirListeClients() {
		return clientDao.obtenirTousClients();
	}

	// Modification
	
	@Override
	public void modifierClient(int idClient, Client client) {
		clientDao.modifierClient(idClient, client);
	}
	
	// Supression

	@Override
	public void supprimerClient(int idClient) {
		clientDao.supprimerClient(idClient);
	}

	// *** COMPTES ***

	@Override
	public void associerCompteCourant(int idClient) {
		int numeroCompte = genererNumero();
		double solde = 0.0;
		String dateOuverture = today();
		CompteCourant compteCourant = new CompteCourant(numeroCompte, solde, dateOuverture, idClient);
		compteDao.creerCompteCourant(compteCourant);
	}

	@Override
	public void associerCompteEpargne(int idClient) {
		int numeroCompte = genererNumero();
		double solde = 0.0;
		String dateOuverture = today();
		CompteEpargne compteEpargne = new CompteEpargne(numeroCompte, solde, dateOuverture, idClient);
		compteDao.creerCompteEpargne(compteEpargne);
	}

	private int genererNumero() {
		int randomNumber = (int) (Math.random() * 100_000_000);
		return randomNumber;
	}

	private String today() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		// TODO Bug [Normal] Dans un test avec l'heure et les minutes (HH:MM), l'heure
		// de création semble être toujours la même. Cette implémentation suffira pour
		// nos besoins.
		Date date = new Date();
		return sdfDate.format(date);
	}

	@Override
	public CompteCourant obtenirCompteCourant(int idClient) {
		return compteDao.obtenirCompteCourant(idClient);
	}

	@Override
	public CompteEpargne obtenirCompteEpargne(int idClient) {
		return compteDao.obtenirCompteEpargne(idClient);
	}

	// *** OPERATIONS ***
	
	@Override
	public double simulerCredit(double montant, int dureeMois, double taux) {
		dureeMois *= -1;
		taux /= 100;
		double mensualite = ((montant * (taux / 12)) / (1 - Math.pow((1 + (taux / 12)), dureeMois))); 
		return mensualite;
	}
	
	@Override
	public void faireVirement(int idClientSrc, int idClientDest, double montant) {
		CompteCourant compteSrc = compteDao.obtenirCompteCourant(idClientSrc);
		CompteCourant compteDest = compteDao.obtenirCompteCourant(idClientDest);
		
		double soldeSrc = compteSrc.getSolde();
		double soldeDest = compteDest.getSolde();

		if (soldeSrc - montant > CompteCourant.DECOUVERT_MAX) {
			compteSrc.setSolde(soldeSrc - montant);
			compteDest.setSolde(soldeDest + montant);
		} else {
			// TODO Faire une erreur plus élaborée - throw ?
			System.err.println("Dépassement du découvert autorisé !");
		}
		
		compteDao.modifierCompteCourant(idClientSrc, compteSrc);
		compteDao.modifierCompteCourant(idClientDest, compteDest);
		
	}

	// *** CONSEILLERS ***
	
	@Override
	public Conseiller obtenirConseiller(String login) {
		return consDao.obtenirConseiller(login);
	}

}
