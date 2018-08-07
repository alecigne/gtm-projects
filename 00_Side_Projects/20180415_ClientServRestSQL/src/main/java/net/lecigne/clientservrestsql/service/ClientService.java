package net.lecigne.clientservrestsql.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import net.lecigne.clientservrestsql.model.Client;

@Produces("application/xml")
public interface ClientService {

	@POST
	@Path("/client/")
	Response creerClient(Client client);
	
	@GET
	@Path("/client/{idClient}")
	Client obtenirClient(@PathParam("idClient") long idClient);
	
	@GET
	@Path("/client/all")
	List<Client> obtenirTousClients();
	
	@PUT
	@Path("/client/")
	Response modifierClient(Client client);
	
	@DELETE
	@Path("/client/{idClient}")
	Response supprimerClient(@PathParam("idClient") long idClient);
	
	@POST
	@Path("client/{idClient}/associercompte")
	Response associerCompte(@PathParam("idClient") long idClient);
	
}
