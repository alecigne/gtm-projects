package net.lecigne.proxibanquesi.service;

import java.security.SecureRandom;
import net.lecigne.proxibanquesi.dao.ConseillerDao;
import net.lecigne.proxibanquesi.dao.ConseillerDaoImp;
import net.lecigne.proxibanquesi.model.Conseiller;

public class ConseillerServiceImp implements ConseillerService {

	private ConseillerDao conseillerDao = new ConseillerDaoImp();
	private static final int pwdLength = 8;
	
	@Override
	public void creerConseiller(Conseiller conseiller) {
		conseiller.setLogin(genererLogin(conseiller));
		conseiller.setPassword(genererPassword(pwdLength));
		conseillerDao.creerConseiller(conseiller);
	}
	
	// Helpers
	
	private String genererLogin(Conseiller conseiller) {
		String login = new String();
		login = (conseiller.getPrenom().substring(0, 1) + conseiller.getNom()); // "JVon Neumann"
		login = login.toLowerCase().replaceAll("\\s",""); // "jvonneumann"
		int randomNumber = (int) (Math.random() * 10_000); // "jvonneumann336"
		login += String.format("%04d", randomNumber); // "jvonneumann0336"
		return login;
	}
	
	private String genererPassword(int len) {
		String AB = "0123456789abcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}
	
	@Override
	public Conseiller obtenirConseiller(String login, String password) {
		Conseiller conseiller = obtenirConseillerParLogin(login);
		if (conseiller != null && pwdIsCorrect(conseiller, password)) {
			return conseiller;
		} else {
			return null;
		}
	}
	
	// Helpers
	
	private Conseiller obtenirConseillerParLogin(String login) {
		return conseillerDao.obtenirConseiller(login);
	}
	
	private boolean pwdIsCorrect(Conseiller conseiller, String pwd) {
		if (conseiller.getPassword().equals(pwd)) {
			return true;
		}
		return false;
	}
	
}
