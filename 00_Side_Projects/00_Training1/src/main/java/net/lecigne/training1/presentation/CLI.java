package net.lecigne.training1.presentation;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.lecigne.training1.config.SpringConfig;
import net.lecigne.training1.exceptions.ServiceException;
import net.lecigne.training1.model.Client;
import net.lecigne.training1.service.ClientService;
import net.lecigne.training1.service.ClientServiceImpAuto;

public class CLI {

	public static ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	public static ClientService service = context.getBean(ClientServiceImpAuto.class);
	public static Scanner sc = new Scanner(System.in);
	private static Logger LOGGER = LoggerFactory.getLogger(CLI.class);

	public static Client promptClient() {
		System.out.println("Veuillez saisir les informations client.");
		System.out.println("Nom : ");
		String nom = sc.nextLine();
		System.out.println("Prénom : ");
		String prenom = sc.nextLine();
		return new Client(nom, prenom);
	}

	private static long promptId(String message) {
		System.out.println(message);
		long id = sc.nextLong();
		sc.nextLine();
		return id;
	}

	public static void creerClient() {
		Client client = promptClient();
		try {
			service.sauvegarderClient(client);
		} catch (ServiceException e) {
			LOGGER.warn("exception thrown", e);
		}
	}

	public static void listerTousClients() {
		System.out.println(service.obtenirTousClients());
	}

	public static void modifierClient() {
		long id = promptId("Veuillez saisir l'ID du client à modifier : ");
		Client clientModif = service.obtenirClient(id);
		Client clientModele = promptClient();
		clientModif.setNom(clientModele.getNom());
		clientModif.setPrenom(clientModele.getPrenom());
		service.modifierClient(clientModif);
	}

	public static void lireClient() {
		long id = promptId("Veuillez saisir l'ID du client à lire : ");
		System.out.println(service.obtenirClient(id));
	}

	public static void supprimerClient() {
		long id = promptId("Veuillez saisir l'ID du client à supprimer : ");
		service.supprimerClient(id);
	}

	public static void menu() {
		boolean continuer = true;
		while (continuer) {
			System.out.println("\n=== Menu de gestion clients ===\n");
			int choix;
			System.out.println("1. Créer un client");
			System.out.println("2. Lister tous les clients");
			System.out.println("3. Modifier un client");
			System.out.println("4. Lire les informations d'un client");
			System.out.println("5. Supprimer un client");
			System.out.println("0. Déconnexion");
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
				modifierClient();
				break;
			case 4:
				lireClient();
				break;
			case 5:
				supprimerClient();
				break;
			case 0:
				System.out.println("Déconnexion...");
				continuer = false;
				break;
			default:
				System.err.println("Entrée invalide.");
			}
		}
	}

	public static void main(String[] args) {
		menu();
	}

}
