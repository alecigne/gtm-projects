package net.lecigne.genericite.before;

public class Paire {

	Object premier;
	Object second;
	
	public Paire(Object premier, Object second) {
		this.premier = premier;
		this.second = second;
	}
	
	public Object getPremier() {
		return premier;
	}

	public Object getSecond() {
		return second;
	}

}
