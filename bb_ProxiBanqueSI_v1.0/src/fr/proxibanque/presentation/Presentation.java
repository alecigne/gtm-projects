package fr.proxibanque.presentation;

import java.util.ArrayList;
import java.util.Scanner;
import fr.proxibanque.model.*;
import fr.proxibanque.service.*;

/**
 * Cette classe contient des méthodes liées à l'interface en ligne de commande
 * de ProxiBanqueSI. Celles-ci sollicitent l'utilisateur afin de d'écrire des
 * informations dans la base de données ProxiBanque.
 * 
 * @author Anthony Le Cigne
 * @version 0.0.1
 *
 */

public class Presentation {

	// Attributs statiques - à affiner
	public static Scanner sc = new Scanner(System.in);
	public static Conseiller conseiller = new Conseiller("C0005", "John", "Doe");
	public static ConseillerService cs = new ConseillerServiceImp();

	// *** HELPERS DE L'INTERFACE ***

	private static Client promptClient() {
		System.out.println("Veuillez saisir les informations client.");
		System.out.println("Nom : ");
		String nom = sc.nextLine();
		System.out.println("Prénom : ");
		String prenom = sc.nextLine();
		System.out.println("Adresse : ");
		String adresse = sc.nextLine();
		System.out.println("Code postal : ");
		String codePostal = sc.nextLine();
		System.out.println("Ville : ");
		String ville = sc.nextLine();
		System.out.println("Téléphone : ");
		String téléphone = sc.nextLine();
		return new Client(nom, prenom, adresse, codePostal, ville, téléphone);
	}

	private static String promptId(String message) {
		System.out.println(message);
		String id = sc.nextLine();
		return id;
	}

	// *** MENU PRINCIPAL ***

	public static void menuPrincipal() {
		boolean continuer = true;
		while (continuer) {
			int choix;
			System.out.println("=== Bienvenue sur ProxiBanqueSI ===\n");
			System.out.println("1. Gestion clients");
			System.out.println("2. Opérations bancaires");
			System.out.println("0. Déconnexion");
			choix = sc.nextInt();
			sc.nextLine();
			switch (choix) {
			case 1:
				sousMenuClients();
				break;
			case 2:
				sousMenuOperations();
				break;
			// TODO Bug [Normal] Si plusieurs méthodes menuPrincipal() sont imbriquées,
			// plusieurs déconnexions peuvent être nécessaires
			case 0:
				System.out.println("Déconnexion...");
				continuer = false;
				break;
			default:
				System.err.println("Entrée invalide.");
			}
		}
	}

	// *** 1 - CLIENTS ***

	public static void sousMenuClients() {
		System.out.println("\n=== Menu de gestion clients ===\n");
		int choix;
		System.out.println("1. Créer un client");
		System.out.println("2. Lister tous les clients");
		System.out.println("3. Lister les ID de vos clients");
		System.out.println("4. Modifier un client");
		System.out.println("5. Lire les informations d'un client");
		System.out.println("6. Supprimer un client");
		System.out.println("7. Assigner un compte épargne");
		System.out.println("8. Assigner une carte à un compte courant");
		System.out.println("0. Retour au menu supérieur");
		choix = sc.nextInt();
		sc.nextLine();
		switch (choix) {
		case 1:
			creerClient();
			break;
		case 2:
			listerTousClients();
			break;
		case 3:
			listerClientsConseiller();
			break;
		case 4:
			modifierClient();
			break;
		case 5:
			lireClient();
			break;
		case 6:
			supprimerClient();
			break;
		case 7:
			assignerCompteEpargne();
			break;
		case 8:
			assignerCarte();
			break;
		case 0:
			menuPrincipal();
			break;
		default:
			System.err.println("Entrée invalide.");
		}
	}

	// *** 1.1 - CREER CLIENTS ***

	public static void creerClient() {
		Client client = promptClient();
		String id = cs.creerClient(conseiller, client);
		System.out.println(cs.obtenirClient(id));
	}

	// *** 1.2 - LISTER TOUS LES CLIENTS ***

	public static void listerTousClients() {
		System.out.println(cs.obtenirListeClients());
	}

	// *** 1.3 - LISTER CLIENTS CONSEILLER ***

	public static void listerClientsConseiller() {
		System.out.println(conseiller);
	}

	// *** 1.4 - MODIFIER CLIENT ***

	// TODO Bug [CRITICAL] - la modification supprime les ajouts postérieurs à la
	// création
	// (compte courant, compte épargne, cartes)
	public static void modifierClient() {
		String id = promptId("Veuillez saisir l'ID du client à modifier : ");
		Client client = promptClient();
		cs.modifierClient(id, client);
	}

	// *** 1.5 - LIRE CLIENT ***

	public static void lireClient() {
		String id = promptId("Veuillez saisir l'ID du client à lire : ");
		System.out.println(cs.obtenirClient(id));
	}

	// *** 1.6 - SUPPRIMER CLIENT ***

	public static void supprimerClient() {
		String id = promptId("Veuillez saisir l'ID du client à supprimer : ");
		cs.supprimerClient(conseiller, id);
	}

	// *** 1.7 - ASSIGNER COMPTE EPARGNE ***

	public static void assignerCompteEpargne() {
		String id = promptId("Veuillez saisir l'ID du client bénéficiaire du compte Epargne : ");
		Client client = cs.obtenirClient(id);
		cs.assignerCompteEpargne(client);
	}

	// *** 1.8 - ASSIGNER CARTE (à un compte courant) ***

	public static void assignerCarte() {
		String id = promptId("Veuillez saisir l'ID du client bénéficiaire de la carte : ");
		Client client = cs.obtenirClient(id);
		CarteVisa carte = null;
		System.out.println("1. Carte Electron");
		System.out.println("2. Carte Premier");
		int choix = sc.nextInt();
		sc.nextLine();
		switch (choix) {
		case 1:
			carte = new CarteElectron();
			break;
		case 2:
			carte = new CartePremier();
			break;
		default:
			System.err.println();
		}
		cs.assignerCarte(client, carte);
	}

	// *** 2 - OPERATIONS ***

	public static void sousMenuOperations() {
		System.out.println("\n=== Menu d'opérations bancaires ===\n");
		int choix;
		System.out.println("1. Faire un virement");
		System.out.println("2. Créditer un compte courant");
		System.out.println("3. Auditer l'agence");
		choix = sc.nextInt();
		sc.nextLine();
		switch (choix) {
		case 1:
			faireVirement();
			break;
		case 2:
			crediterCompteCourant();
			break;
		case 3:
			auditerAgence();
			break;
		case 0:
			menuPrincipal();
			break;
		default:
			System.err.println("Entrée invalide.");
		}
	}

	// *** 2.1 - VIREMENTS ***

	public static void faireVirement() {
		String id1 = promptId("Veuillez saisir l'ID du client prélevé : ");
		String id2 = promptId("Veuillez saisir l'ID du client crédité : ");
		System.out.println("Veuillez saisir le montant : ");
		double montant = sc.nextDouble();
		sc.nextLine();
		cs.faireVirement(cs.obtenirClient(id1), cs.obtenirClient(id2), montant);
	}

	// *** 2.2 - CREDITER COMPTE ***

	// Ceci peut être utilisé pour tester la fonction d'audit - on débite de manière
	// à passer le montant sous 5000 $CUR
	public static void crediterCompteCourant() {
		String id = promptId("Veuillez saisir l'ID du client à créditer : ");
		System.out.println("Veuillez saisir un montant : ");
		double montant = sc.nextDouble();
		sc.nextLine();
		cs.crediterCompte(cs.obtenirClient(id), montant);
	}

	// *** 2.3 - AUDIT ***

	public static void auditerAgence() {
		ArrayList<Client> clientsAlerte = cs.auditerAgence();
		System.out.println("=> Clients débiteurs de plus de 5000 € : ");
		System.out.println(clientsAlerte);
	}

	public static void main(String[] args) {

		// Création Gérant
		Gerant gerant = new Gerant("G0001", "Stan", "Smith");
		
		// Création Agence
		Agence agence = new Agence("A1234", "16/03/2018", gerant);
		
		System.out.println(agence.toString());
		
		// Création de 9 clients pour le dernier conseiller (celui qui
		// manipule l'interface) (permet de tester la limite d'ajout en ajoutant 2
		// clients supplémentaires)
		for (int i = 0; i < 9; i++) {
			cs.creerClient(conseiller, new Client("Nom", "Prénom", "Adresse",
					"CodePostal", "Ville", "Telephone"));
		}
		
		menuPrincipal();

	}

}