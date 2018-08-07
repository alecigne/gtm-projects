package net.lecigne.proxibanquesi.dao;

import net.lecigne.proxibanquesi.model.Gerant;

public interface GerantDao {

	Gerant obtenirGerantByLogin(String login);
	
}
