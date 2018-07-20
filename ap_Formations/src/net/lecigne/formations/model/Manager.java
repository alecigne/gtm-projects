package net.lecigne.formations.model;

public class Manager extends Employe {

	// *** CONSTRUCTORS ***
	
	public Manager(int id, String nom, String prenom) {
		super(id, nom, prenom);
	}

	// *** OTHER METHODS ***
	
	@Override
	public void demanderFormation(DemandeFormation formation) {
		formation.setEtatValidation(DemandeFormation.ACCORDE);
		super.demanderFormation(formation);
		System.out.println("Il est manager, il valide donc sa formation."+formation);
	}
	
}
