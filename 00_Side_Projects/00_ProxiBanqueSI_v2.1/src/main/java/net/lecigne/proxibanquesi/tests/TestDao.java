package net.lecigne.proxibanquesi.tests;

import net.lecigne.proxibanquesi.dao.ClientDao;
import net.lecigne.proxibanquesi.dao.ClientDaoImp;
import net.lecigne.proxibanquesi.dao.ConseillerDao;
import net.lecigne.proxibanquesi.dao.ConseillerDaoImp;
import net.lecigne.proxibanquesi.model.Client;
import net.lecigne.proxibanquesi.model.Conseiller;

public class TestDao {

	public static void main(String[] args) {

		// Clients
		
		ClientDao clientDao = new ClientDaoImp();

		for (int i = 0; i < 10; i++) {
			Client client = new Client("Nom" + i, "Prénom" + i, i + " rue de la Source", "92120",
					"Montrouge", "0100000000");
			client.setIdConseiller(1);
			clientDao.creerClient(client);
		}

		for (int i = 0; i < 10; i++) {
			Client client = new Client("Nom" + i, "Prénom" + i, i + " rue de la Source", "92120",
					"Montrouge", "0100000000");
			client.setIdConseiller(2);
			clientDao.creerClient(client);
		}
		
		// Conseillers
		
		ConseillerDao conseillerDao = new ConseillerDaoImp();
		
		Conseiller conseiller = new Conseiller("Leblanc", "Gérard");
		
		conseiller.setLogin("gleblanc");
		conseiller.setPassword("6789");
		
		conseillerDao.creerConseiller(conseiller);

	}

}
