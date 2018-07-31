package org.formation.ws.rest.jaxrs;

import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Produces({"application/xml", "application/json"})
public interface PatientService {

	@GET
	@Path("/patient/{id}/")
	Patient getPatient(@PathParam("id") String id);

	@PUT
	@Path("/patient/")
	Response updatePatient(Patient patient);

	@POST
	@Path("/patient/")
	Response addPatient(Patient patient);

	@DELETE
	@Path("/patient/{id}/")
	Response deletePatients(@PathParam("id") String id);
	
	@GET
	@Path("/patient/all")
	Map<Long, Patient> getAllPatients();

	@GET
	@Path("/prescription/{id}/")
	Prescription getPrescription(@PathParam("id") String prescriptionId);

}