package net.lecigne.clientservrestsql.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.lecigne.clientservrestsql.model.Compte;

public class CompteServiceImp implements CompteService {

	@Override
	public Compte creerCompte(double solde) {
		String numero = genererNumero();
		String dateOuverture = today();
		Compte compte = new Compte(numero, solde, dateOuverture);
		return compte;
	}

	private String genererNumero() {
		String str = "";
		int randomNumber = (int) (Math.random() * 1_000_000_000);
		str = str + String.format("%09d", randomNumber);
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

}
