package org.formation.singleton;

public class SimpleSingleton1 {

	private static final SimpleSingleton1 INSTANCE = new SimpleSingleton1();
	
	private SimpleSingleton1() {
	}
	
	public static SimpleSingleton1 getInstance() {
		return INSTANCE;
	}
	
}
