package net.lecigne.clientservrestsql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Compte {

	// *** ATTRIBUTES ***

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCompte;
	private String numero;
	private double solde;
	private String dateOuverture;

	// *** CONSTRUCTORS ***

	public Compte() {
	}

	public Compte(String numero, double solde, String dateOuverture) {
		this.numero = numero;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	// *** GETTERS and SETTERS ***

	public long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}

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

	// *** OTHER METHODS ***

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", numero=" + numero + ", solde=" + solde
				+ ", dateOuverture=" + dateOuverture + "]";
	}

}
