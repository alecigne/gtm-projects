package org.formation.fonctionnelle;

import java.util.Scanner;

public class Fonct3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sum  = x + y;
		int diff = x - y;
		int prod = x * y;
		int quot = x / y;
		int mod  = x % y;
		
		int[] results = { sum, diff, prod, quot, mod };
		
		for(int result : results) {
			System.out.println(result);
		}
		
		sc.close();
		
	}
	
}
