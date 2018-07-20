package org.formation.fonctionnelle;

import java.util.Scanner;

public class Fonct2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Veuillez saisir le rayon :");
		double rayon = sc.nextDouble();
		
		System.out.println("Veuillez saisir la longueur :");
		double longueur = sc.nextDouble();
		
		double aire = Math.pow(rayon, 2) * Math.PI;
		double volume = aire * longueur;
		
		System.out.println("Aire : " + aire + " cm2");
		System.out.println("Volume : " + volume + " cm3");
		
		sc.close();
		
	}

}