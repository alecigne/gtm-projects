package org.formation.fonctionnelle;

import java.util.Scanner;

public class Fonct3double {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		double x = sc.nextInt();
		double y = sc.nextInt();
		
		double sum  = x + y;
		double diff = x - y;
		double prod = x * y;
		double quot = x / y;
		double mod  = x % y;
		
		double[] results = { sum, diff, prod, quot, mod };
		
		for(double result : results) {
			System.out.println(result);
		}
		
		sc.close();
		
	}
	
}
