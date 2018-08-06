package org.formation.spring.cd;

public class SgtPeppers implements CompactDisc {

	@Override
	public boolean play() {
		System.out.println("Playing the Beatles...");
		return true;
	}
	

}
