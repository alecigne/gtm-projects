package net.lecigne.genericite.test;

import net.lecigne.genericite.before.*;
import net.lecigne.genericite.after.*;

public class Main {

	public static void main(String[] args) {

//		Paire p = new Paire("abc", "xyz");
//		String x = (String) p.getPremier();
//		Double y = (Double) p.getSecond(); // runtime error
		
		GPaire<String> p = new GPaire<>("abc", "xyz");
		String x = p.getPremier();
//		Double y = p.getSecond(); // compile-time error
		
	}

}
