package net.lecigne.guessmynumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int guess;
		int guesses = 0;
		int maxGuesses = 10;
		int number = (int) (Math.random() * 100 + 1);
		
		System.out.println("=== WELCOME TO GUESS MY NUMBER ===");
		System.out.println("You have " + maxGuesses + " chances...");
		
		do {
			System.out.println("Enter a number between 1 and 100:");
			guess = sc.nextInt();
			sc.nextLine();
			guesses++;
			
			if (guess > number) {
				System.out.println("Wrong! The number is less than " + guess + ".");
			} else if (guess < number) {
				System.out.println("Wrong! The number is greater than " + guess + ".");
			} else {
				System.out.println("You win! The number is " + number + ".");
				break;
			}
			
		} while (guess != number && guesses < maxGuesses);
		
		sc.close();
		
	}
}