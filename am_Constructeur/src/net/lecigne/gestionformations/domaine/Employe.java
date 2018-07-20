package net.lecigne.gestionformations.domaine;

/**
 * @author Anthony Le Cigne
 */

public class Employe {

	// *** ATTRIBUTES ***

	private String nom;
	private String prenom;
	private int id;

	// *** CONSTRUCTORS ***

	public Employe(String nom, String prenom, int id) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	// *** ACCESSORS ***

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public int getId() {
		return this.id;
	}
	
	// *** MUTATORS ***

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// *** OTHER METHODS ***
	
	/**
	 * L'employe demande une formation
	 */

	public void demanderFormation(String theme) {
		System.out.println("L'employé "
				+ this.prenom 
				+ " " 
				+ this.nom 
				+ " demande une formation sur " 
				+ theme
				+ ".");
	}

	/**
	 * Méthode toString() permet d'avoir l'état d'un objet dès lors qu'on affiche
	 * référence System.out.println (monObjet);
	 */
	
	@Override
	public String toString() {
		return "Employé [id="
				+ this.id
				+ ", nom="
				+ this.nom
				+ ", prenom="
				+ this.prenom + "]";
	}

}