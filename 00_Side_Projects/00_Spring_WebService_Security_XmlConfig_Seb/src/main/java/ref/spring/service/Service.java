package ref.spring.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.security.access.annotation.Secured;

import ref.spring.model.Voiture;

//http://localhost:8080/WebService_Security/services/voitureService/voitures/
@Produces({ "application/xml" })
public interface Service {

	@Secured("ROLE_CUSTOMER")
	@GET
	@Path("/voitures/")
	public List<Voiture> selectAll();

	@Secured("ROLE_ADMIN")
	@POST
	@Path("/voitures/")
	public void add(Voiture voiture);

}
