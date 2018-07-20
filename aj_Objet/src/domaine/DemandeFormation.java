package domaine;

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

	// *** GETTERS and SETTERS ***
	
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

}
