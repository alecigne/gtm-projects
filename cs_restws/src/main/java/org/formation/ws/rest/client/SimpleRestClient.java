package org.formation.ws.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.formation.ws.rest.jaxrs.Patient;

public class SimpleRestClient {

	private static final String ID = "id";
	private static final String ID_PLACEHOLDER = "/{id}";
	private static final String PATIENTS = "/patient/";
	private static final String SERVICE_PATIENTS = "http://localhost:8080/restws/services/patientservice";

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(SERVICE_PATIENTS).path(PATIENTS).path(ID_PLACEHOLDER).resolveTemplate(ID,
				"123");
		Response response = webTarget.request().get();
		Patient p = response.readEntity(Patient.class);
		System.out.println(p.getName() + " status " + response.getStatus());
		client.close();
		response.close();
	}

}
