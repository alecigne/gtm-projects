package net.lecigne.gestionformations.domaine;

/**
 * @author Anthony Le Cigne
 */

public class Manager extends Employe {

	/**
	 * Constructeur de la classe Manager, créé à partir du constructeur de la classe
	 * Employé.
	 * 
	 * @param nom
	 * @param prenom
	 * @param id
	 */

	public Manager(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}

	/**
	 * Le manager peut valider les demandes de formation de ses employés.
	 */
	
	public void validerFormation() {
		System.out.println("Le manager " 
				+ this.getPrenom()
				+ " " 
				+ this.getNom()
				+ " valide les demandes de formation de ses employés.");
	}

}
