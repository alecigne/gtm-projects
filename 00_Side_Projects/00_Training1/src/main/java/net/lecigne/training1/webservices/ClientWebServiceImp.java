package net.lecigne.training1.webservices;

import java.util.List;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.lecigne.training1.exceptions.ServiceException;
import net.lecigne.training1.model.Client;
import net.lecigne.training1.presentation.CLI;
import net.lecigne.training1.service.ClientServiceImpAuto;

@Component
public class ClientWebServiceImp implements ClientWebService {

	@Autowired
	ClientServiceImpAuto clientServiceImpAuto;
	private static Logger LOGGER = LoggerFactory.getLogger(CLI.class);

	@Override
	public Response sauvegarderClient(Client client) {
		try {
			clientServiceImpAuto.sauvegarderClient(client);
			return Response.ok().build();
		} catch (ServiceException e) {
			LOGGER.warn("exception thrown", e);
			return Response.notModified().build();
		}
	}

	@Override
	public Response modifierClient(Client client) {
		clientServiceImpAuto.modifierClient(client);
		return Response.ok().build();
	}

	@Override
	public Client obtenirClient(long idClient) {
		return clientServiceImpAuto.obtenirClient(idClient);
	}

	@Override
	public List<Client> obtenirTousClients() {
		return clientServiceImpAuto.obtenirTousClients();
	}

	@Override
	public Response supprimerClient(long idClient) {
		clientServiceImpAuto.supprimerClient(idClient);
		return Response.ok().build();
	}

}
