package net.lecigne.formations.model;

public class DemandeFormation {

	public static final String REFUS = "Refusé";
	public static final String ACCORDE = "Accordée";
	public static final String ATTENTE = "En attente";
	private String dateDebut;
	private String dateDemande;
	private String dateFin;
	private String etatValidation;
	
	// *** CONSTRUCTORS ***
	
	public DemandeFormation(String dateDebut, String dateFin, String etatValidation) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatValidation = etatValidation;
	}

	public DemandeFormation(String dateDebut, String dateFin) {
		this(dateDebut, dateFin, ATTENTE);
	}

	// *** ACCESSORS ***
	
	public String getDateDebut() {
		return dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	// *** MUTATORS ***
	
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

	// *** OTHER METHODS ***
	
	@Override
	public String toString() {
		return "DemandeFormation [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", etatValidation="
				+ etatValidation + "]";
	}		

}
