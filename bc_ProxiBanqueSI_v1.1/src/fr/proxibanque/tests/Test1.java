package fr.proxibanque.tests;

import fr.proxibanque.modele.CartePremier;
import fr.proxibanque.modele.Client;
import fr.proxibanque.service.*;

public class Test1 {

	public static void main(String[] args) {

		ProxiBanqueService pbs = new ProxiBanqueServiceImp();
		
		Client c1 = new Client("Marie", "Durand", "1 rue de la Source", "75001", "Paris", "0600000001");
		Client c2 = new Client("Jacques", "Durand", "1 rue de la Source", "75001", "Paris", "0600000001");
		Client c1bis = new Client("Marie", "Durand", "1 rue de la Source", "75001", "Paris", "0600000001");

		// *** CREATION ***
		System.out.println("=== CREATION ===");
		
		String id1 = pbs.creerClient(c1);
		String id2 = pbs.creerClient(c2);
		System.out.println(pbs.obtenirListeClients());
		
		// *** MODIFICATION ***
		System.out.println("=== MODIFICATION ===");
		
		pbs.modifierClient(id1, c1bis);
		System.out.println(pbs.obtenirListeClients());
		
		// *** COMPTE EPARGNE ***
		System.out.println("=== COMPTE EPARGNE ===");
		
		pbs.assignerCompteEpargne(id1);
		System.out.println(pbs.obtenirListeClients());
		
		// *** CARTE ***
		System.out.println("=== CARTE ===");
		
		CartePremier cartePremier = new CartePremier();
		pbs.assignerCarte(id1, cartePremier);
		System.out.println(pbs.obtenirListeClients());
		
		// *** VIREMENT ***
		System.out.println("=== VIREMENT ===");
		
		pbs.faireVirement(id1, id2, 500);
		System.out.println(pbs.obtenirListeClients());
	
		// *** CREDITER ***
		System.out.println("=== CREDITER UN COMPTE ===");
		
		pbs.crediterCompte(id1, 500);
		System.out.println(pbs.obtenirListeClients());
		
	}
}