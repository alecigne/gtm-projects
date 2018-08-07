package net.lecigne.training1.service;

import java.security.SecureRandom;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.lecigne.training1.dao.AutoClientDao;
import net.lecigne.training1.dao.ManualClientDao;
import net.lecigne.training1.exceptions.ServiceException;
import net.lecigne.training1.model.Client;

@Service("clientServiceImpAuto")
public class ClientServiceImpAuto implements ClientService {

	@Autowired
	AutoClientDao autoClientDao;
	private static int pwdLength = 8;

	@Override
	public void sauvegarderClient(Client client) throws ServiceException {
		if (!clientEstValide(client)) {
			throw new ServiceException("Client invalide !");
		} else {
			client.setLogin(genererLogin(client));
			client.setPassword(genererPassword(pwdLength));
			autoClientDao.save(client);
		}
	}

	// Helpers

	private boolean clientEstValide(Client client) {
		if (client == null) {
			return false;
		} else if (client.getNom() == null || client.getNom().isEmpty()) {
			return false;
		} else if (client.getPrenom() == null || client.getPrenom().isEmpty()) {
			return false;
		}
		return true;
	}

	private String genererLogin(Client client) {
		String login = new String();
		login = client.getPrenom().substring(0, 1) + client.getNom(); // JVon Neumann
		login = login.toLowerCase().replaceAll("\\s", ""); // jvonneumann
		int random = (int) (Math.random() * 10_000); // 0 to 9999 (jvonneumann456)
		login += String.format("%04d", random); // jvonneumann0456
		return login;
	}

	private String genererPassword(int length) {
		String characters = "0123456789abcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int randomPos = rnd.nextInt(characters.length());
			char randomChar = characters.charAt(randomPos);
			sb.append(randomChar);
		}
		return sb.toString();
	}

	@Override
	public void modifierClient(Client client) {
		autoClientDao.save(client);
	}

	@Override
	public Client obtenirClient(long idClient) {
		return autoClientDao.findOne(idClient);
	}

	@Override
	public List<Client> obtenirTousClients() {
		return autoClientDao.findAll();
	}

	@Override
	public void supprimerClient(long idClient) {
		autoClientDao.delete(idClient);
	}

	public void setClientDao(ManualClientDao clientDao) {
		this.autoClientDao = autoClientDao;
	}

}
