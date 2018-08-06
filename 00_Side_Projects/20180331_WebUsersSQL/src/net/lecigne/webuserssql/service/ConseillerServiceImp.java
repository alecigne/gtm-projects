package net.lecigne.webuserssql.service;

import net.lecigne.webuserssql.dao.ConseillerDaoImp;
import net.lecigne.webuserssql.dao.IConseillerDao;
import net.lecigne.webuserssql.model.Conseiller;

public class ConseillerServiceImp implements IConseillerService {

	private IConseillerDao dao = new ConseillerDaoImp();

	@Override
	public void creerConseiller(Conseiller conseiller) {
		String login = genererLogin(conseiller);
		conseiller.setLogin(login);
		if (conseiller != null) {
			dao.creerConseiller(conseiller);
		}
	}

	private String genererLogin(Conseiller conseiller) {
		String login = new String();
		login = (conseiller.getPrenom().substring(0, 1) + conseiller.getNom()); // "JVon Neumann"
		login = login.toLowerCase().replaceAll("\\s", ""); // "jvonneumann"
		int randomNumber = (int) (Math.random() * 10_000); // "jvonneumann336"
		login += String.format("%04d", randomNumber); // "jvonneumann0336"
		return login;
	}

	@Override
	public Conseiller obtenirConseiller(String login) {
		return dao.obtenirConseiller(login);
	}

}
