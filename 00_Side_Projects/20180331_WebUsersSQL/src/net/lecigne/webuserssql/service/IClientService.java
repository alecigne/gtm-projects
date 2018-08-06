package net.lecigne.webuserssql.service;

import java.util.List;
import net.lecigne.webuserssql.model.Client;

/**
 * Cette interface recense les opérations qui peuvent être effectuées sur les
 * clients.
 * 
 * @author Anthony Le Cigne
 *
 */

public interface IClientService {

	public void creerClient(Client client);

	public void modifierClient(int id);

	public Client obtenirClient(int id);

	public void supprimerClient(int id);

	public List<Client> obtenirListeClients();

}