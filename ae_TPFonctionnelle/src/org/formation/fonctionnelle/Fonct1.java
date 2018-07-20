package org.formation.fonctionnelle;

import java.util.Scanner;

public class Fonct1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un chiffre :");
		double nombre = sc.nextDouble();
		
		double output = nombre * Math.PI;
		
		System.out.println(output);
		sc.close();
		
	}

}