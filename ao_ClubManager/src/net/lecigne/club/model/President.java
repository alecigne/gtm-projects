package net.lecigne.club.model;

import java.util.Scanner;

/**
 * This class represents the club's president. The President class inherits from
 * the Member class.
 * 
 * @author Anthony Le Cigne
 * @version 0.0.1
 *
 */

public final class President extends Member {

	// *** ATTRIBUTES ***
	
	private String electionDate;

	// *** CONSTRUCTORS ***
	
	public President(String firstName, String lastName, int age, String electionDate) {
		super(firstName, lastName, age);
		this.electionDate = electionDate;
	}

	// *** ACCESSORS ***
	
	public String getElectionDate() {
		return electionDate;
	}

	// *** MUTATORS ***
	
	public void setElectionDate(String electionDate) {
		this.electionDate = electionDate;
	}
	
	// *** OTHER METHODS ***
	
	public static President askForPresident() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("First name: ");
			String firsfName = sc.nextLine().trim();

			System.out.println("Last name: ");
			String lastName = sc.nextLine().trim();

			System.out.println("Age:");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.println("Election date:");
			String electionDate = sc.nextLine().trim();

			President pres = new President(firsfName, lastName, age, electionDate);
			return pres;
		}
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ " (president since "
				+ this.electionDate
				+ ")";
	}
	
}
