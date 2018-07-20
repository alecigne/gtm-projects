package net.lecigne.gestionformations.domaine;

/**
 * @author Anthony Le Cigne
 */

public class DemandeFormation {

	// *** ATTRIBUTES ***

	private String theme;
	private String dateDemande;
	private String etatValidation;

	// *** CONSTRUCTORS ***

	public DemandeFormation(String theme, String dateDemande, String etatValidation) {
		this.theme = theme;
		this.dateDemande = dateDemande;
		this.etatValidation = etatValidation;
	}

	// *** ACCESSORS ***

	public String getTheme() {
		return this.theme;
	}

	public String getDateDemande() {
		return this.dateDemande;
	}

	public String getEtatValidation() {
		return this.etatValidation;
	}

	// *** MUTATORS ***

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

}
