package net.lecigne.formations.lanceur;

import net.lecigne.formations.model.*;

public class Main {

	public static void main(String[] args) {

		Employe employe1 = new Employe(1, "Michel", "Dupont");
		Manager manager1 = new Manager(2, "Jacques", "Durand");
		
		DemandeFormation demande1 = new DemandeFormation("01-01-2018", "01-01-2019");
		DemandeFormation demande2 = new DemandeFormation("02-02-2018", "02-02-2019");
		
		employe1.demanderFormation(demande1);
		manager1.demanderFormation(demande2);
		
//		employe1.getListFormations();
//		manager1.getListFormations();
		
		}
	
}
