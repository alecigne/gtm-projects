package net.lecigne.training1.webservices;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import net.lecigne.training1.model.Client;

public interface ClientWebService {
	
	@POST
	@Path("/client")
	Response sauvegarderClient(Client client);

	@PUT
	@Path("/client/")
	Response modifierClient(Client client);

	@GET
	@Path("/client/{idClient}")
	Client obtenirClient(@PathParam("idClient") long idClient);

	@GET
	@Path("/client/all")
	List<Client> obtenirTousClients();

	@DELETE
	@Path("/client/{idClient}")
	Response supprimerClient(@PathParam("idClient") long idClient);
	
}
