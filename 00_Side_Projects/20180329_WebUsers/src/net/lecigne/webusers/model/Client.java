package net.lecigne.webusers.model;

/**
 * Cette classe décrit les caractéristiques d'un client ProxiBanque.
 * 
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public class Client {

	// *** ATTRIBUTES ***

	private String id;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String telephone;

	// *** CONSTRUCTORS ***

	public Client(String nom, String prenom, String adresse, String codePostal, String ville,
			String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}

	// *** GETTERS and SETTERS ***

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	// *** OTHER METHODS ***

		@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", codePostal=" + codePostal + ", ville=" + ville + ", telephone=" + telephone + "]";
	}	

}