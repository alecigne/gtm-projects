package fr.proxibanque.modele;

/**
 * Cette classe décrit les caractéristiques d'un client ProxiBanque.
 * 
 * @author Anthony Le Cigne
 *
 */

public class Client {

	// *** ATTRIBUTS ***

	private String id; // Généré automatiquement par la couche DAO
	private String prenom;
	private String nom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String telephone;
	private CompteCourant compteCourant; // Généré automatiquement par la couche service
	private CompteEpargne compteEpargne; // Attribué plus tard au besoin par la couche service

	// *** CONSTRUCTEURS ***

	public Client(String prenom, String nom, String adresse, String codePostal,
			String ville, String telephone) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}

	// *** ACCESSEURS et MUTATEURS ***
	// TODO Supprimer les méthodes inutilisées

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

	// TODO à supprimer
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}
	
	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	// *** AUTRES METHODES ***

	@Override
	public String toString() {
		String strEpargne = new String();

		// Chaîne de caractère par défaut si pas de compte épargne
		if (this.compteEpargne != null) {
			strEpargne = this.compteEpargne.toString();
		} else {
			strEpargne = "pas de compte épargne associée au client";
		}
				
		return  "\n=== CLIENT ===\n"
				+ "ID client : " + this.id + "\n"
				+ "Prénom : " + this.prenom + "\n"
				+ "Nom : " + this.nom + "\n"
				+ "Adresse : " + this.adresse + "\n"
				+ "Code postal : " + this.codePostal + "\n"
				+ "Ville : " + this.ville + "\n"
				+ "Téléphone : " + this.telephone + "\n"
				+ "Compte courant : " + this.compteCourant + "\n"
				+ "Compte épargne : " + strEpargne + "\n";
	}

}
