package net.lecigne.gestionsalles.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Promotion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long promotionId;
	private String nom;

	// Est "promotions" dans la classe Salle
	@ManyToMany(mappedBy = "promotions")
	private Set<Salle> salles = new HashSet<>();

	// Est "promotion" dans la classe Etudiant ; persiste les étudiants, les supprime en cascade
	@OneToMany(mappedBy = "promotion", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<Etudiant> etudiants = new HashSet<>();

	public Promotion() {
	}

	public Promotion(String nom) {
		this.nom = nom;
	}

	public long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(long promotionId) {
		this.promotionId = promotionId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Salle> getSalles() {
		return salles;
	}

	public void setSalles(Set<Salle> salles) {
		this.salles = salles;
	}

	public Set<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	public void addEtudiant(Etudiant etudiant) {
		this.etudiants.add(etudiant);
		etudiant.setPromotion(this);
	}
	
	public void addSalle(Salle salle) {
		this.salles.add(salle);
		salle.getPromotions().add(this);
	}
	
	public void removeSalle(Salle salle) {
		this.salles.remove(salle);
		salle.getPromotions().remove(this);
	}

}
