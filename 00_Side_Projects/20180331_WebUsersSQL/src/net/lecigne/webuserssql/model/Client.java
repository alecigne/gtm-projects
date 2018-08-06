package net.lecigne.webuserssql.model;

/**
 * Cette classe décrit les caractéristiques d'un client.
 * 
 * @author Anthony Le Cigne
 *
 */

public class Client {

	// *** ATTRIBUTS ***

	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String telephone;

	// *** CONSTRUCTEURS ***

	public Client(String nom, String prenom, String adresse, String codePostal, String ville,
			String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}

	public Client() {
	}

	// *** ACCESSEURS et MUTATEURS ***

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	public String getTelephone() {
		return telephone;
	}

	// *** AUTRES METHODES ***

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", codePostal=" + codePostal + ", ville=" + ville + ", telephone=" + telephone
				+ "]";
	}

}
