package net.lecigne.jdbc.domain;

public class Client {

	String raisonSociale;
	String adresse;
	String ville;
	int codePostal;
	String telephone;

	// CONSTRUCTORS

	public Client(String raisonSociale, String adresse, String ville, int codePostal,
			String telephone) {
		this.raisonSociale = raisonSociale;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.telephone = telephone;
	}

	// GETTERS

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getVille() {
		return ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public String getTelephone() {
		return telephone;
	}

}
