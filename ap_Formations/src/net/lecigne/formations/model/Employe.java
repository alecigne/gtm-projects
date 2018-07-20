package net.lecigne.formations.model;

import java.util.*;

public class Employe {

	private int id;
	private String nom;
	private String prenom;
	private ArrayList<DemandeFormation> listFormations = new ArrayList<>();
	
	// *** CONSTRUCTORS ***
	
	public Employe(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	// *** ACCESSORS ***
	
	public int getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	// *** MUTATORS ***
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// *** OTHER METHODS ***
	
	public void getListFormations() {
		for(DemandeFormation f : this.listFormations) {
			System.out.println(f);
		}
	}
	
	public void demanderFormation(DemandeFormation formation) {
		listFormations.add(formation);
		
		System.out.println("L'employé "
				+ prenom
				+ " "
				+ nom
				+ " demande une formation du "
				+ formation.getDateDebut()
				+ " au "
				+ formation.getDateFin()
				+ ". Etat : "
				+ formation.getEtatValidation());
	}

	@Override
	public String toString() {
		return "Employe [id=" 
				+ id 
				+ ", nom=" 
				+ nom 
				+ ", prenom=" 
				+ prenom 
				+ ", listFormations=" 
				+ listFormations 
				+ "]";
	}
	
}
