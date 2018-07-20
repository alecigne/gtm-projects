package net.lecigne.formations.lanceur;

import java.util.ArrayList;
import java.util.Collection;

import net.lecigne.formations.model.*;

public class Main {

	static void afficher(Collection<? extends Employe> list) {
		for (Employe employe : list) {
			System.out.println(employe.toString());
		}
	}
	
	static void addElements(Collection<Employe> coll, Employe... employes) {
		for (Employe employe : employes) {
			coll.add(employe);
		}
	}
	
	public static void main(String[] args) {

		Collection<Employe> listeEmploye = new ArrayList<>();
		Collection<Manager> listeManager = new ArrayList<>();
		
//		listeEmploye = listeManager; // Ne peut fonctionner
		
		Employe e1 = new Employe(0, "Chirac", "Jacques");
		Employe e2 = new Employe(1, "Sarkozy", "Nicolas");
		Manager m1 = new Manager(2, "Mitterrand", "François");
		
		addElements(listeEmploye, e1, e2, m1);
		
		Main.afficher(listeEmploye);
		Main.afficher(listeManager);
		
	}
		
}