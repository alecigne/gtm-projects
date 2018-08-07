package fr.proxibanquesi.model;

public class Compte {

	// *** ATTRIBUTES ***

	private String numero;
	private double solde;
	private String dateOuverture;
	public final static double decouvertMax = -1000.0;
	private int idClient;

	// *** CONSTRUCTORS ***

	public Compte(String numero, double solde, String dateOuverture, int idClient) {
		this.numero = numero;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.idClient = idClient;
	}

	// *** GETTERS and SETTERS ***

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public int getIdclient() {
		return idClient;
	}

	// *** OTHER METHODS ***

	@Override
	public String toString() {
		return "N° = " + this.numero + ", solde = " + this.solde + ", date ouv. = "
				+ this.dateOuverture + ", idClient = " + this.idClient;
	}

}
