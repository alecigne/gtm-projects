package net.lecigne.gestionsalles.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String surnom;

	@ManyToOne
	@JoinColumn(name = "promo_id")
	private Promotion promotion;

	public Etudiant() {
	}

	public Etudiant(String surnom) {
		this.surnom = surnom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

}
