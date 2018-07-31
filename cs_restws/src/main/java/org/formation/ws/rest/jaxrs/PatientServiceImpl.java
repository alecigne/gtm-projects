package org.formation.ws.rest.jaxrs;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

public class PatientServiceImpl implements PatientService {
	private long currentId = 123;
	Map<Long, Patient> patients = new HashMap<Long, Patient>();
	Map<Long, Prescription> prescriptions = new HashMap<Long, Prescription>();

	public PatientServiceImpl() {
		init();
	}

	// Création d'instances
	final void init() {
		Patient patient = new Patient();
		patient.setName("John");
		patient.setId(currentId);
		patients.put(patient.getId(), patient);

		Prescription prescription = new Prescription();
		prescription.setDescription("prescription 223");
		prescription.setId(223);
		prescriptions.put(prescription.getId(), prescription);
	}

	public Response addPatient(Patient patient) {
		patient.setId(++currentId);
		patients.put(patient.getId(), patient);
		return Response.ok(patient).build();
	}

	public Patient getPatient(String id) {
		Long longId = Long.valueOf(id);
		System.out.println("get patient " + longId);
		Patient patient = patients.get(longId);
		return patient;
	}

	public Response updatePatient(Patient updatedPatient) {
		Patient patient = patients.get(updatedPatient.getId());
		Response response = null;
		if (patient != null) {
			patients.put(updatedPatient.getId(), updatedPatient);
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}

	public Response deletePatients(String id) {
		System.out.println("deletePatients " + id);
		Long longId = Long.valueOf(id);
		Patient patient = patients.get(longId);
		Response response = null;
		if (patient != null) {
			patients.remove(longId);
			response = Response.ok(true).build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}
	
	public Map<Long, Patient> getAllPatients() {
		return this.patients;
	}

	public Prescription getPrescription(String prescriptionId) {
		Long longId = Long.valueOf(prescriptionId);
		Prescription prescription = prescriptions.get(longId);
		return prescription;
	}

}
