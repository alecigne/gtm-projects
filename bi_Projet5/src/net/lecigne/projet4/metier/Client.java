package net.lecigne.projet4.metier;

public class Client {

	private String raisonSociale;
	private String adresse;
	private int codePostal;
	private String ville;
	private String telephone;

	public Client(String raisonSociale, String adresse, int codePostal, String ville,
			String telephone) {
		this.raisonSociale = raisonSociale;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return raisonSociale + " -> " + adresse + " - " + codePostal + " " + ville + " - "
				+ telephone + "\n";
	}

}
