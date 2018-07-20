package net.lecigne.templatemethod.model;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class Pizza {

	private static String name;

	public Pizza(String name) {
		Pizza.name = name;
	}

	abstract void addTopping();

	abstract void addCheese();

	private static String getName() {
		return name;
	}

	private void prepareDough() {
		System.out.println("Préparation de la pâte...");
	}

	private void putTomatoSauce() {
		System.out.println("Ajout de la sauce tomate...");

	}

	private void bakePizza() {
		System.out.println("Cuisson de la pizza...");
	}

	public final void makePizza() {
		String str = "Préparation de la pizza " + getName() + " en cuisine...";
		String nextStr = IntStream.range(0, str.length()).mapToObj(i -> "=").collect(Collectors.joining(""));
		System.out.println(str);
		System.out.println(nextStr);
		prepareDough();
		putTomatoSauce();
		addTopping();
		addCheese();
		bakePizza();
	}

}