package net.lecigne.gestionsalles.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Salle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long salleId;
	private String nom;

	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "promo_salle", joinColumns = { @JoinColumn(name = "promo_id") }, inverseJoinColumns = {
			@JoinColumn(name = "salle_id") })
	private Set<Promotion> promotions = new HashSet<>();

	public Salle() {
	}

	public Salle(String nom) {
		super();
		this.nom = nom;
	}

	public Set<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(Set<Promotion> promotions) {
		this.promotions = promotions;
	}

}
