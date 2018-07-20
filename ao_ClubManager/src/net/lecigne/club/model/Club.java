package net.lecigne.club.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class describes a club object - a group of interest with a name and a
 * list of members.
 * 
 * @author Anthony Le Cigne
 * @version 0.0.1
 *
 */

public class Club {

	// *** ATTRIBUTES ***

	private String name;
	private ArrayList<Member> members = new ArrayList<Member>();

	// *** CONSTRUCTORS ***

	public Club(String name) {
		this.name = name;
	}

	// *** ACCESSORS ***

	public String getName() {
		return name;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	// *** MUTATORS ***

	public void setName(String name) {
		this.name = name;
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}

	// *** OTHERS METHODS ***

	public void addMember(Member member) {
		this.members.add(member);
	}

	public static Club askForClub() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to ClubManager - the club management system");
			System.out.println("Please enter the name of your club: ");
			String clubName = sc.nextLine().trim();
			Club club = new Club(clubName);
			return club;
		}
	}

	// toString() - redefinition to print the club's info
	@Override
	public String toString() {
		String str = "";

		for (Member member : this.members) {
			str = str + member.toString() + ".\n";
		}

		return "This is the club "
			+ this.name
			+ ", with "
			+ this.members.size()
			+ " member(s). The members are:\n"
			+ str
			+ "\n";
	}

}