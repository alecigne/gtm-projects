package fr.proxibanquesi.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import fr.proxibanquesi.dao.CompteDao;
import fr.proxibanquesi.dao.CompteDaoImp;
import fr.proxibanquesi.model.Compte;

public class CompteServiceImp implements CompteService {

	CompteDao compteDao = new CompteDaoImp();

	@Override
	public void associerCompte(int idClient) {
		String numeroCompte = genererNumero();
		double solde = 0.0;
		String dateOuverture = today();
		Compte compte = new Compte(numeroCompte, solde, dateOuverture, idClient);
		compteDao.creerCompte(compte);
	}

	private String genererNumero() {
		String str = "";
		int randomNumber = (int) (Math.random() * 100_000_000);
		str = str + String.format("%08d", randomNumber);
		return str;
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
	public Compte obtenirCompte(int idClient) {
		return compteDao.obtenirCompte(idClient);
	}

}
