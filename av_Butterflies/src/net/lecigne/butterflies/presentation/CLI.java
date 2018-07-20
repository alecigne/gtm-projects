package net.lecigne.butterflies.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import net.lecigne.butterflies.model.*;
import net.lecigne.butterflies.service.BoardCollectionStrategy;
import net.lecigne.butterflies.service.BoxCollectionStrategy;
import net.lecigne.butterflies.service.CollectionStrategy;

/**
 * This class contains a few methods related to the Command Line Interface. They
 * ask the user for input and return a relevant object. See
 * net.lecigne.butterflies.launch.Main for their use.
 * 
 * @author Anthony Le Cigne
 * @version 0.0.1
 *
 */

public class CLI {

	private static Scanner sc = new Scanner(System.in);

	public static Collector promptInfo() {
		Collector collector;
		System.out.println("What's your name?");
		collector = new Collector(sc.nextLine());
		return collector;
	}

	public static char promptContinue() {
		char choice = ' ';
		do {
			System.out.println("Do you want to continue? (y/n)");
			choice = sc.nextLine().charAt(0);
		} while (choice != 'y' && choice != 'n');
		return choice;
	}

	public static Butterfly promptButterfly() {
		String species;
		String color;
		Butterfly butterfly;
		System.out.println("Enter the butterfly species:");
		species = sc.nextLine();
		System.out.println("Enter the butterfly color:");
		color = sc.nextLine();
		butterfly = new Butterfly(species, color);
		return butterfly;
	}

	public static ArrayList<Butterfly> promptButterflies() {
		char choice = ' ';
		ArrayList<Butterfly> butterflies = new ArrayList<>();
		do {
			butterflies.add(CLI.promptButterfly());
			choice = CLI.promptContinue();
		} while (choice == 'y');
		return butterflies;
	}
	
	public static CollectionStrategy promptStrategy() {
		int choice;
		CollectionStrategy cs = null; // TODO Is this the right thing?
		System.out.println("What's your collection strategy?");
		System.out.println("1. Nail down the butterfly on a board");
		System.out.println("2. Put the butterfly in a box");
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
			case 1:
				cs = new BoardCollectionStrategy();
				break;
			case 2:
				cs = new BoxCollectionStrategy();
				break;
		}
		return cs;
	}
}
