package net.lecigne.exceptions.tests;

import net.lecigne.exceptions.exceptions.InvalidRadiusException;
import net.lecigne.exceptions.model.CircleCustomEx;

public class MainCustomEx {

	public static void main(String[] args) {

		try {
			CircleCustomEx c1 = new CircleCustomEx(-2);
			System.out.println("Code after the error.");
		} catch (InvalidRadiusException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Radius " + e.getRadius() + " is the problem."); // On pourrait écrire dans
																																					// un log
		}

	}

}
