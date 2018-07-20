package net.lecigne.club.model;

import java.util.Scanner;

/**
 * This class represents a member from the club. A club typically contains
 * multiple members.
 * 
 * @author Anthony Le Cigne
 * @version 0.0.1
 *
 */

public class Member {

	// *** ATTRIBUTES ***
	
	private String firstName;
	private String lastName;
	private int age;
	
	// *** CONSTRUCTORS ***
	
	public Member(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// *** GETTERS ***
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	
	// *** SETTERS ***
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// *** OTHER METHODS ***
	
	public static Member askForMember() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("First name: ");
			String firstName = sc.nextLine().trim();

			System.out.println("Last name: ");
			String lastName = sc.nextLine().trim();

			System.out.println("Age:");
			int age = sc.nextInt();
			sc.nextLine();

			Member member = new Member(firstName, lastName, age);
			return member;
		}
	}
	
	// toString() - redefinition to print the member's info
	public String toString() {
		return this.firstName
				+ " "
				+ this.lastName
				+ ", "
				+ this.age
				+ " years old";
	}

}