package net.lecigne.simpleinterface.launcher;

import net.lecigne.simpleinterface.dao.*;

public class Main {

	public static void main(String[] args) {

		Dao md1 = new MemoryDao();

		md1.create("Arnaud");
		md1.create("Clothilde");
		md1.create("Ozlem");

		for(String s : md1.getList()) {
			System.out.println(s);
		}

	}

}