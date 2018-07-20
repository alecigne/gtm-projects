package org.formation.fonctionnelle;

import java.util.Scanner;

public class PileOuFace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		char reponse = ' ';
		
		do {
			do {
				System.out.println("Choose a value.");
				choice = sc.nextInt();
				sc.nextLine();
			} while (choice != 0 && choice != 1);

			int number = (int) (Math.random() * 2);
		
			if(choice == number) {
				System.out.println("Gagné !");
			} else if (number == 0) {
				System.out.println("Perdu ! C'est pile.");
			} else {
				System.out.println("Perdu ! C'est face.");
			}
			
			System.out.println("Continuer ? [o/n]");
			reponse = sc.nextLine().charAt(0);
		
		} while (reponse == 'o');
		
		sc.close();

	}

}