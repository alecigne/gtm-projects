package net.lecigne.webusers.dao;

import java.util.List;
import net.lecigne.webusers.model.Client;

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