package net.lecigne.forloops;

import java.util.ArrayList;

public class Main {

	public static final String VILLEPREF = "Paris";
	
	public static void main(String[] args) {

		// Etape 1 : imprimer les chiffres de 1 à 12
		for(int i = 0; i < 13; i++) {
			System.out.println(i);
		}
		
		// Etape 2 : afficher valeurs tableau (for)
		int[] numbers = { 1, 3, 5, 7, 9 };
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// Etape 2 bis : afficher valeurs tableau (for-each)
		for(int i : numbers) {
			System.out.println(i);
		}
		
		// Etape 3 : trouver une ville (tableau)
		String[] arrVille = { "Reims", "Toulouse", "Paris" };
		
		for(String ville : arrVille) {
			if(ville.equals(VILLEPREF)) {
				System.out.println("C'est ma ville préférée !");
			} else {
				System.out.println("...");
			}
		}
		
		// Etape 3 bis : trouver une ville (liste)
		ArrayList<String> listCities = new ArrayList<String>();
		listCities.add("Reims");
		listCities.add("Toulouse");
		listCities.add("Paris");
		
		for(String city : listCities) {
			if(city.equals(VILLEPREF)) {
				System.out.println("C'est ma ville préférée !");
			} else {
				System.out.println("...");
			}
		}

	}
}