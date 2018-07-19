package fr.proxibanque.service;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.proxibanque.model.Client;
import fr.proxibanque.model.Conseiller;
import fr.proxibanque.service.ConseillerService;
import fr.proxibanque.service.ConseillerServiceImp;

/**
 * Cette classe réalise quatre tests :
 * - test d'une simulation d'un crédit ;
 * - test d'un virement SANS dépassement de la limite de découvert autorisé
 * - test d'un virement AVEC dépassement de la limite de découvert autorisé
 * - test d'attribution d'un maximum de 10 clients à un conseiller
 *  
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

class TestService {

	private ConseillerService cs;
	Client c1;
	Client c2;
	Conseiller cons;

	@BeforeEach
	void instanciationConseillerServiceImp() {

		cs = new ConseillerServiceImp();

		// Création conseiller
		cons = new Conseiller("ID1", "Prénom", "Nom");

		// Création client
		c1 = new Client("Nom-1", "Prénom-1", "Adresse-1", "CodePostal-1", "Ville-1", "Telephone-1");
		cs.creerClient(cons, c1);
		c2 = new Client("Nom-2", "Prénom-2", "Adresse-2", "CodePostal-2", "Ville-2", "Telephone-2");
		cs.creerClient(cons, c2);

	}

	@Test
	void testSimulerCredit() {

		assertTrue((int) ((1000 / 12) * 1.7) == (int) (cs.simulerCredit(1000, 12, 1.7)));
	}

	@Test
	void testFaireVirement() {

		cs.faireVirement(c1, c2, 500.0);
		assertTrue(-500 == c1.getCompteCourant().getSolde());
		assertTrue(+500 == c2.getCompteCourant().getSolde());
	}

	@Test
	void testFaireVirementMaximumMilleEuro() {

		// Le solde des deux comptes ne devrait pas changer et un message d'erreur
		// devrait s'afficher
		cs.faireVirement(c1, c2, 1001.0);
		assertTrue(0 == c1.getCompteCourant().getSolde());
		assertTrue(0 == c2.getCompteCourant().getSolde());
	}

	@Test
	void testCreationClientMaximumDixParConseiller() {
		
		Conseiller cons2 = new Conseiller("ID2", "Prénom", "Nom");
		
		// Assignation de 15 clients à un conseiller
		for (int i = 0; i < 15; i++) {
			cs.creerClient(cons2, new Client("Nom-" + i, "Prénom-" + i, "Adresse-" + i, "CodePostal-" + i, "Ville-" + i,
					"Telephone-" + i));
		}
		
		// Seul 10 clients seront attribué au conseillers
		assertTrue(10==cons2.getListeClients().size());
	}

}
