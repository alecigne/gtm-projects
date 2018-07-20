package org.formation.fonctionnelle;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your birth date:");
		int year = sc.nextInt();
		
		String[] signs = { "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger",
				"Rabbit", "Dragon", "Snake", "Horse", "Sheep" };
		
		System.out.println(signs[year % 12]);
				
		sc.close();
	}
}
