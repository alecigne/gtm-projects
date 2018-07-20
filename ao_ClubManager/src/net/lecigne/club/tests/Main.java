package net.lecigne.club.tests;

import java.util.*;

import net.lecigne.club.model.*;

/**
 * @author Anthony Le Cigne
 * @version 0.0.1
 *
 */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// *** CLUB POPULATION ***
		
		// Club
		Club club = Club.askForClub();

		// Members
		char choice = ' ';
		
		do {
			System.out.println("Please enter a new member's info.");
			Member member = Member.askForMember(); 
			club.addMember(member);
			
		 	do {
		 		System.out.println("Do you want to register another member? (y/n)");
		 		choice = sc.nextLine().charAt(0);
		 	} while(choice != 'y' && choice != 'n');
			
		} while(choice == 'y');
		
		// President
		System.out.println("Please enter the president's info.");
		President president = President.askForPresident();
		club.addMember(president);
		
		// Closing the resource
		sc.close();
			
		// *** CLUB INFO ***
		
		System.out.println(club);

	}

}
