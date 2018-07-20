package net.lecigne.guessmynumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int guess, guesses = 0;
		int number = (int) (Math.random() * 10);
		
		do {
			System.out.println("Enter a number between 0 and 9:");
			guess = sc.nextInt();
			guesses++;
			
			if (guess > number) {
				System.out.println("Wrong! The number is less than " + guess + ".");
			} else if (guess < number) {
				System.out.println("Wrong! The number is greater than " + guess + ".");
			}
			
		} while (guess != number);
		
		System.out.println("You win! The number is " + number + ". "
				+ "You won in " + guesses + " guesses.");
		
		sc.close();
		
	}
}