package net.lecigne.tpstringbuilder.main;

public class Main {

	public static void main(String[] args) {

		String tortue = "";
		String lievre = "";
		int times = 10_000;

		// CONCAT WITH +

		System.out.println("=== TURTLE (+) ===");
		long turtleBefore = System.nanoTime();

		for (int i = 0; i < times; i++) {
			tortue += "_" + i;
		}

		long turtleAfter = System.nanoTime();
		long turtleTotal = turtleAfter - turtleBefore;
		System.out.println(tortue);
		System.out.println("=> " + turtleTotal + " nanosecs.");
		System.out.println();

		// CONCAT WITH StringBuilder

		System.out.println("=== HARE (StringBuilder) ===");
		long hareBefore = System.nanoTime();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < times; i++) {
			sb.append("_");
			sb.append(i);
		}

		lievre = sb.toString();
		long hareAfter = System.nanoTime();
		long hareTotal = hareAfter - hareBefore;
		System.out.println(lievre);
		System.out.println("=> " + hareTotal + " nanosecs.");
		System.out.println();

		// COMPARISON

		System.out.println("=== Comparison ===");

		if (tortue.equals(lievre)) {
			System.out.println("The two strings are equal.");
		} else {
			System.err.println("The two strings are different!");
		}

		long difference = turtleTotal / hareTotal;
		System.out.println("The hare is " + difference + " times faster.");

	}

}
