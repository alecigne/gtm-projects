package org.formation.singleton;

public class SimpleSingleton2 {

	private static SimpleSingleton2 INSTANCE;
	
	private SimpleSingleton2() {
	}
	
	public static SimpleSingleton2 getInstance() {
		if (INSTANCE == null) {
			return new SimpleSingleton2();
		} else {
			return INSTANCE;
		}
	}
	
}
