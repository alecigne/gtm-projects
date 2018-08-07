package fr.proxibanquesi.model;

/**
 * Création d'un objet Client pour lui associer dans la suite comptes et cartes
 * 
 * @author Anthony le Cigne et Jean-Michel Hiltbrunner
 *
 */
public class Client {

	// *** ATTRIBUTS ***

	private int idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String telephone;

	// *** CONSTRUCTEURS ***

	public Client(String nom, String prenom, String adresse, String codePostal, String ville, String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}

	// *** ACCESSEURS et MUTATEURS ***

	/**
	 * Retourne l'identifiant du client
	 * 
	 * @return Identifiant unique du client
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * Définit l'identifiant unique du client
	 * 
	 * @param idClient
	 *            nombre servant d'identifiant unique
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	/**
	 * Retourne le nom du client
	 * 
	 * @return Nom du client
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Retourne le prénom du client
	 * 
	 * @return prénom du client
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Retourne l'adresse du client
	 * 
	 * @return Adresse du client
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Retourne le code postal du client
	 * 
	 * @return Code postal du client
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * Retourne la ville du client
	 * 
	 * @return Ville du client
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Retourne le numéro de téléphone du client
	 * 
	 * @return Téléphone du client
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Définit le nom du client
	 * 
	 * @param nom
	 *            Nom du client
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Définit le prénom du client
	 * 
	 * @param prenom
	 *            prénom du client
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Définit l'adresse du client
	 * 
	 * @param adresse
	 *            Adresse du client
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Définit le code Postal du client
	 * 
	 * @param codePostal
	 *            Code postal du client
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Définit la ville du client
	 * 
	 * @param ville
	 *            Ville du client
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * Définit le numéro de téléphone du client
	 * 
	 * @param telephone
	 *            Téléphone du client
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	// *** AUTRES METHODES ***

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", telephone=" + telephone + "]";
	}

}