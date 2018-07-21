package net.lecigne.gestionsalles.util;

import java.security.SecureRandom;

public class RndStr {

	private static final String AB = "0123456789abcdefghijklmnopqrstuvwxyz";
	private static SecureRandom rnd = new SecureRandom();
	
	public static String generate(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}
	
}
