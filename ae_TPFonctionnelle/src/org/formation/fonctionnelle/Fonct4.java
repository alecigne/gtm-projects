package org.formation.fonctionnelle;

import java.util.Scanner;

public class Fonct4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int number = sc.nextInt();
		int length = String.valueOf(number).length();
		int result = 0;

		for(int x = 0, nb = number; x < length; x++, nb /= 10) {
			result += nb % 10;
		}
		
		System.out.println("Sum of digits from number " + number + ": " + result);

		sc.close();
		
	}

}