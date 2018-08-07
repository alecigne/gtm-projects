package fr.proxibanquesi.service;

import java.util.List;

import fr.proxibanquesi.model.*;

public interface ClientService {

	// *** CREATION ***

	void creerClient(Client client);

	// *** LECTURE ***

	Client obtenirClient(int idClient);

	List<Client> obtenirListeClients();

	// *** MODIFICATION ***

	void modifierClient(int idClient);

	// *** SUPPRESSION ***

	void supprimerClient(int idClient);

}