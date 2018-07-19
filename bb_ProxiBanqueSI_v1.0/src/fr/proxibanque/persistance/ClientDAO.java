package fr.proxibanque.persistance;

import java.util.List;
import fr.proxibanque.model.Client;

/**
 * Cette interface décrit les opérations générales liées à la persistance des
 * données clients (CRUD - Create, Read, Update, Delete).
 *
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public interface ClientDAO {

	public String sauvegarder(Client c);
	public void modifier(String id, Client c);
	public Client obtenir(String id);
	public void supprimer(String id);
	public List<Client> obtenirTous();
	
}